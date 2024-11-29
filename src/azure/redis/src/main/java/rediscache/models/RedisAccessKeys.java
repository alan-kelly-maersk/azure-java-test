// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Redis cache access keys.
 */
@Immutable
public final class RedisAccessKeys implements JsonSerializable<RedisAccessKeys> {
    /*
     * The current primary key that clients can use to authenticate with Redis cache.
     */
    private String primaryKey;

    /*
     * The current secondary key that clients can use to authenticate with Redis cache.
     */
    private String secondaryKey;

    /**
     * Creates an instance of RedisAccessKeys class.
     */
    public RedisAccessKeys() {
    }

    /**
     * Get the primaryKey property: The current primary key that clients can use to authenticate with Redis cache.
     * 
     * @return the primaryKey value.
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * Get the secondaryKey property: The current secondary key that clients can use to authenticate with Redis cache.
     * 
     * @return the secondaryKey value.
     */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedisAccessKeys from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedisAccessKeys if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RedisAccessKeys.
     */
    public static RedisAccessKeys fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedisAccessKeys deserializedRedisAccessKeys = new RedisAccessKeys();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("primaryKey".equals(fieldName)) {
                    deserializedRedisAccessKeys.primaryKey = reader.getString();
                } else if ("secondaryKey".equals(fieldName)) {
                    deserializedRedisAccessKeys.secondaryKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRedisAccessKeys;
        });
    }
}
