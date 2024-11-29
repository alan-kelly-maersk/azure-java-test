// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * Patch schedule entry for a Premium Redis Cache.
 */
@Fluent
public final class ScheduleEntry implements JsonSerializable<ScheduleEntry> {
    /*
     * Day of the week when a cache can be patched.
     */
    private DayOfWeek dayOfWeek;

    /*
     * Start hour after which cache patching can start.
     */
    private int startHourUtc;

    /*
     * ISO8601 timespan specifying how much time cache patching can take.
     */
    private Duration maintenanceWindow;

    /**
     * Creates an instance of ScheduleEntry class.
     */
    public ScheduleEntry() {
    }

    /**
     * Get the dayOfWeek property: Day of the week when a cache can be patched.
     * 
     * @return the dayOfWeek value.
     */
    public DayOfWeek getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set the dayOfWeek property: Day of the week when a cache can be patched.
     * 
     * @param dayOfWeek the dayOfWeek value to set.
     * @return the ScheduleEntry object itself.
     */
    public ScheduleEntry setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Get the startHourUtc property: Start hour after which cache patching can start.
     * 
     * @return the startHourUtc value.
     */
    public int getStartHourUtc() {
        return this.startHourUtc;
    }

    /**
     * Set the startHourUtc property: Start hour after which cache patching can start.
     * 
     * @param startHourUtc the startHourUtc value to set.
     * @return the ScheduleEntry object itself.
     */
    public ScheduleEntry setStartHourUtc(int startHourUtc) {
        this.startHourUtc = startHourUtc;
        return this;
    }

    /**
     * Get the maintenanceWindow property: ISO8601 timespan specifying how much time cache patching can take.
     * 
     * @return the maintenanceWindow value.
     */
    public Duration getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: ISO8601 timespan specifying how much time cache patching can take.
     * 
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the ScheduleEntry object itself.
     */
    public ScheduleEntry setMaintenanceWindow(Duration maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dayOfWeek", this.dayOfWeek == null ? null : this.dayOfWeek.toString());
        jsonWriter.writeIntField("startHourUtc", this.startHourUtc);
        jsonWriter.writeStringField("maintenanceWindow", CoreUtils.durationToStringWithDays(this.maintenanceWindow));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScheduleEntry from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScheduleEntry if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ScheduleEntry.
     */
    public static ScheduleEntry fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScheduleEntry deserializedScheduleEntry = new ScheduleEntry();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dayOfWeek".equals(fieldName)) {
                    deserializedScheduleEntry.dayOfWeek = DayOfWeek.fromString(reader.getString());
                } else if ("startHourUtc".equals(fieldName)) {
                    deserializedScheduleEntry.startHourUtc = reader.getInt();
                } else if ("maintenanceWindow".equals(fieldName)) {
                    deserializedScheduleEntry.maintenanceWindow
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScheduleEntry;
        });
    }
}
