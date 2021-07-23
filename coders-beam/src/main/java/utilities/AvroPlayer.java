/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package utilities;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** A player. */
@org.apache.avro.specific.AvroGenerated
public class AvroPlayer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -98039037073101711L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroPlayer\",\"namespace\":\"utilities\",\"doc\":\"A player.\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The player name.\"},{\"name\":\"score\",\"type\":\"int\",\"doc\":\"The player score.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroPlayer> ENCODER =
      new BinaryMessageEncoder<AvroPlayer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroPlayer> DECODER =
      new BinaryMessageDecoder<AvroPlayer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AvroPlayer> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AvroPlayer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AvroPlayer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroPlayer>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AvroPlayer to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AvroPlayer from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AvroPlayer instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AvroPlayer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The player name. */
   private java.lang.CharSequence name;
  /** The player score. */
   private int score;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroPlayer() {}

  /**
   * All-args constructor.
   * @param name The player name.
   * @param score The player score.
   */
  public AvroPlayer(java.lang.CharSequence name, java.lang.Integer score) {
    this.name = name;
    this.score = score;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return score;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: score = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The player name.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * The player name.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'score' field.
   * @return The player score.
   */
  public int getScore() {
    return score;
  }


  /**
   * Sets the value of the 'score' field.
   * The player score.
   * @param value the value to set.
   */
  public void setScore(int value) {
    this.score = value;
  }

  /**
   * Creates a new AvroPlayer RecordBuilder.
   * @return A new AvroPlayer RecordBuilder
   */
  public static utilities.AvroPlayer.Builder newBuilder() {
    return new utilities.AvroPlayer.Builder();
  }

  /**
   * Creates a new AvroPlayer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroPlayer RecordBuilder
   */
  public static utilities.AvroPlayer.Builder newBuilder(utilities.AvroPlayer.Builder other) {
    if (other == null) {
      return new utilities.AvroPlayer.Builder();
    } else {
      return new utilities.AvroPlayer.Builder(other);
    }
  }

  /**
   * Creates a new AvroPlayer RecordBuilder by copying an existing AvroPlayer instance.
   * @param other The existing instance to copy.
   * @return A new AvroPlayer RecordBuilder
   */
  public static utilities.AvroPlayer.Builder newBuilder(utilities.AvroPlayer other) {
    if (other == null) {
      return new utilities.AvroPlayer.Builder();
    } else {
      return new utilities.AvroPlayer.Builder(other);
    }
  }

  /**
   * RecordBuilder for AvroPlayer instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroPlayer>
    implements org.apache.avro.data.RecordBuilder<AvroPlayer> {

    /** The player name. */
    private java.lang.CharSequence name;
    /** The player score. */
    private int score;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(utilities.AvroPlayer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing AvroPlayer instance
     * @param other The existing instance to copy.
     */
    private Builder(utilities.AvroPlayer other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * The player name.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * The player name.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public utilities.AvroPlayer.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * The player name.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * The player name.
      * @return This builder.
      */
    public utilities.AvroPlayer.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'score' field.
      * The player score.
      * @return The value.
      */
    public int getScore() {
      return score;
    }


    /**
      * Sets the value of the 'score' field.
      * The player score.
      * @param value The value of 'score'.
      * @return This builder.
      */
    public utilities.AvroPlayer.Builder setScore(int value) {
      validate(fields()[1], value);
      this.score = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'score' field has been set.
      * The player score.
      * @return True if the 'score' field has been set, false otherwise.
      */
    public boolean hasScore() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'score' field.
      * The player score.
      * @return This builder.
      */
    public utilities.AvroPlayer.Builder clearScore() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroPlayer build() {
      try {
        AvroPlayer record = new AvroPlayer();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.score = fieldSetFlags()[1] ? this.score : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroPlayer>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroPlayer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroPlayer>
    READER$ = (org.apache.avro.io.DatumReader<AvroPlayer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    out.writeInt(this.score);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.score = in.readInt();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          this.score = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










