import javax.annotation.Nullable;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.TypeDescriptors;

public class BrokenPlayerExample {
  static class Player {
    @Nullable
    String name;
    @Nullable
    Integer scores;

    public Player() { }

    public Player(String name, Integer scores) {
      this.name = name;
      this.scores = scores;
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
