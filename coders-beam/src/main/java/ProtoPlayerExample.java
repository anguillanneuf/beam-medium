import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.TypeDescriptors;

import utilities.ProtoPlayer.Player;

public class ProtoPlayerExample {
  public static void main(String[] args) {
    PipelineOptions options =
        PipelineOptionsFactory.fromArgs(args).withValidation().create();

    Player.Builder playerBuilder = Player.newBuilder();

    Pipeline p = Pipeline.create(options);
    p
        .apply("Create", Create.of(
            playerBuilder.setName("owl").setScore(22).build(),
            playerBuilder.setName("finch").setScore(95).build(),
            playerBuilder.setName("kestrel").setScore(100).build()
        ))
        .apply("Print", MapElements.into(TypeDescriptors.nulls()).via(
            (Player player) -> {
              System.out.println(player.getName() + ": " + player.getScore());
              return null;
            }))
    ;
    p.run().waitUntilFinish();
  }
}
