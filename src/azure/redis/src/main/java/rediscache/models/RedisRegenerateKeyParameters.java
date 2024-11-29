// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies which Redis access keys to reset.
 */
@Fluent
public final class RedisRegenerateKeyParameters implements JsonSerializable<RedisRegenerateKeyParameters> {
    /*
     * The Redis access key to regenerate.
     */
    private RedisKeyType keyType;

    /**
     * Creates an instance of RedisRegenerateKeyParameters class.
     */
    public RedisRegenerateKeyParameters() {
    }

    /**
     * Get the keyType property: The Redis access key to regenerate.
     * 
     * @return the keyType value.
     */
    public RedisKeyType getKeyType() {
        return this.keyType;
    }

    /**
     * Set the keyType property: The Redis access key to regenerate.
     * 
     * @param keyType the keyType value to set.
     * @return the RedisRegenerateKeyParameters object itself.
     */
    public RedisRegenerateKeyParameters setKeyType(RedisKeyType keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("keyType", this.keyType == null ? null : this.keyType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedisRegenerateKeyParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedisRegenerateKeyParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RedisRegenerateKeyParameters.
     */
    public static RedisRegenerateKeyParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedisRegenerateKeyParameters deserializedRedisRegenerateKeyParameters = new RedisRegenerateKeyParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyType".equals(fieldName)) {
                    deserializedRedisRegenerateKeyParameters.keyType = RedisKeyType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRedisRegenerateKeyParameters;
        });
    }
}