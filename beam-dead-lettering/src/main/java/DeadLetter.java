import java.io.IOException;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.gcp.pubsub.PubsubIO;
import org.apache.beam.sdk.io.gcp.pubsub.PubsubMessage;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.options.StreamingOptions;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.TypeDescriptors;

public class DeadLetter {

  public static void main(String[] args) throws IOException {

    StreamingOptions options = PipelineOptionsFactory.fromArgs(args).as(StreamingOptions.class);

    options.setStreaming(true);

    Pipeline pipeline = Pipeline.create(options);

    pipeline
        // 1) Read string messages from an existing Pub/Sub subscription.
        .apply("Read PubSub Messages", PubsubIO.readMessages().fromSubscription(
            "projects/tz-playground-bigdata/subscriptions/four"
        ))
        .apply("Print", MapElements.into(TypeDescriptors.nulls()).via(
            (PubsubMessage message) -> {
              System.out.println(new String(message.getPayload()));
              return null;
            }
        ))
    ;

    // Execute the pipeline and wait until it finishes running.
    pipeline.run().waitUntilFinish();
  }
}
