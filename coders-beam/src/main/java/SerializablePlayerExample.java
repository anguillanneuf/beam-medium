import java.io.Serializable;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.TypeDescriptors;

public class SerializablePlayerExample {
  static class Player implements Serializable {
    @Nullable
    String name;
    @Nullable
    Integer scores;

    public Player() { }

    public Player(String name, Integer scores) {
      this.name = name;
      this.scores = scores;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Player)) {
        return false;
      }

      Player player = (Player) o;

      if (!Objects.equals(name, player.name)) {
        return false;
      }
      return Objects.equals(scores, player.scores);
    }

    @Override
    public int hashCode() {
      int result = name != null ? name.hashCode() : 0;
      result = 31 * result + (scores != null ? scores.hashCode() : 0);
      return result;
    }
  }

  public static void main(String[] args) {
    PipelineOptions options =
        PipelineOptionsFactory.fromArgs(args).withValidation().create();

    Pipeline p = Pipeline.create(options);
    p
        .apply("Create", Create.of(
            new Player("owl", 22),
            new Player("finch", 95),
            new Player("kestrel", 100))
        )
        .apply("Print", MapElements.into(TypeDescriptors.nulls()).via(
            (Player player) -> {
              System.out.println(player.name + ": " + player.scores);
              return null;
            }))
    ;
    p.run().waitUntilFinish();
  }
}
