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
import java.util.List;

/**
 * List of access policies assignments (with properties) of a Redis cache.
 */
@Fluent
public final class RedisCacheAccessPolicyAssignmentList
    implements JsonSerializable<RedisCacheAccessPolicyAssignmentList> {
    /*
     * List of access policies assignments (with properties) of a Redis cache.
     */
    private List<RedisCacheAccessPolicyAssignment> value;

    /*
     * Link for next set.
     */
    private String nextLink;

    /**
     * Creates an instance of RedisCacheAccessPolicyAssignmentList class.
     */
    public RedisCacheAccessPolicyAssignmentList() {
    }

    /**
     * Get the value property: List of access policies assignments (with properties) of a Redis cache.
     * 
     * @return the value value.
     */
    public List<RedisCacheAccessPolicyAssignment> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of access policies assignments (with properties) of a Redis cache.
     * 
     * @param value the value value to set.
     * @return the RedisCacheAccessPolicyAssignmentList object itself.
     */
    public RedisCacheAccessPolicyAssignmentList setValue(List<RedisCacheAccessPolicyAssignment> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link for next set.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedisCacheAccessPolicyAssignmentList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedisCacheAccessPolicyAssignmentList if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RedisCacheAccessPolicyAssignmentList.
     */
    public static RedisCacheAccessPolicyAssignmentList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedisCacheAccessPolicyAssignmentList deserializedRedisCacheAccessPolicyAssignmentList
                = new RedisCacheAccessPolicyAssignmentList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RedisCacheAccessPolicyAssignment> value
                        = reader.readArray(reader1 -> RedisCacheAccessPolicyAssignment.fromJson(reader1));
                    deserializedRedisCacheAccessPolicyAssignmentList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedRedisCacheAccessPolicyAssignmentList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRedisCacheAccessPolicyAssignmentList;
        });
    }
}