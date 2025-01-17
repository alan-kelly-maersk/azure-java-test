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
 * Parameters body to pass for resource name availability check.
 */
@Fluent
public final class CheckNameAvailabilityParameters implements JsonSerializable<CheckNameAvailabilityParameters> {
    /*
     * Resource name.
     */
    private String name;

    /*
     * Resource type. The only legal value of this property for checking redis cache name availability is
     * 'Microsoft.Cache/redis'.
     */
    private String type;

    /**
     * Creates an instance of CheckNameAvailabilityParameters class.
     */
    public CheckNameAvailabilityParameters() {
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     * 
     * @param name the name value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type. The only legal value of this property for checking redis cache name
     * availability is 'Microsoft.Cache/redis'.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Resource type. The only legal value of this property for checking redis cache name
     * availability is 'Microsoft.Cache/redis'.
     * 
     * @param type the type value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CheckNameAvailabilityParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckNameAvailabilityParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CheckNameAvailabilityParameters.
     */
    public static CheckNameAvailabilityParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckNameAvailabilityParameters deserializedCheckNameAvailabilityParameters
                = new CheckNameAvailabilityParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCheckNameAvailabilityParameters.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCheckNameAvailabilityParameters.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckNameAvailabilityParameters;
        });
    }
}
