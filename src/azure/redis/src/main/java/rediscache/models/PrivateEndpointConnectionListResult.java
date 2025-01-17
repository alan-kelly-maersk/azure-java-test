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
 * List of private endpoint connection associated with the specified storage account.
 */
@Fluent
public final class PrivateEndpointConnectionListResult
    implements JsonSerializable<PrivateEndpointConnectionListResult> {
    /*
     * Array of private endpoint connections
     */
    private List<PrivateEndpointConnection> value;

    /**
     * Creates an instance of PrivateEndpointConnectionListResult class.
     */
    public PrivateEndpointConnectionListResult() {
    }

    /**
     * Get the value property: Array of private endpoint connections.
     * 
     * @return the value value.
     */
    public List<PrivateEndpointConnection> getValue() {
        return this.value;
    }

    /**
     * Set the value property: Array of private endpoint connections.
     * 
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionListResult object itself.
     */
    public PrivateEndpointConnectionListResult setValue(List<PrivateEndpointConnection> value) {
        this.value = value;
        return this;
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
     * Reads an instance of PrivateEndpointConnectionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionListResult.
     */
    public static PrivateEndpointConnectionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionListResult deserializedPrivateEndpointConnectionListResult
                = new PrivateEndpointConnectionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PrivateEndpointConnection> value
                        = reader.readArray(reader1 -> PrivateEndpointConnection.fromJson(reader1));
                    deserializedPrivateEndpointConnectionListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionListResult;
        });
    }
}
