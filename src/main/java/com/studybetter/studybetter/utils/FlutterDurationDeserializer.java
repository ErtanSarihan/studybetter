package com.studybetter.studybetter.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.Duration;

public class FlutterDurationDeserializer extends JsonDeserializer<Duration> {

    @Override
    public Duration deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String durationString = jsonParser.getText();

        // Custom logic to convert the durationString to a Duration object
        String[] parts = durationString.split(":");
        long hours = Long.parseLong(parts[0]);
        long minutes = Long.parseLong(parts[1]);
        double seconds = Double.parseDouble(parts[2]);

        long secondsPart = (long) seconds;
        int nanosecondsPart = (int) ((seconds - secondsPart) * 1_000_000_000);

        return Duration.ofHours(hours).plusMinutes(minutes).plusSeconds(secondsPart).plusNanos(nanosecondsPart);
    }
}