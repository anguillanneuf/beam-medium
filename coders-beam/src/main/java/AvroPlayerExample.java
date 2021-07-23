import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.TypeDescriptors;

import utilities.AvroPlayer;

public class AvroPlayerExample {
  public static void main(String[] args) {
    PipelineOptions options =
        PipelineOptionsFactory.fromArgs(args).withValidation().create();

    Pipeline p = Pipeline.create(options);
    p
        .apply("Create", Create.of(
            new AvroPlayer("owl", 22),
            new AvroPlayer("finch", 95),
            new AvroPlayer("kestrel", 100))
        )
        .apply("Print", MapElements.into(TypeDescriptors.nulls()).via(
            (AvroPlayer player) -> {
              System.out.println(player.getName() + ": " + player.getScore());
              return null;
            }))
    ;
    p.run().waitUntilFinish();
  }
}
