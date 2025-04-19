package com.bookmyshow.common.library.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Component
public class JsonTimestampSerializer extends JsonSerializer<Timestamp>{

@Override
public void serialize(Timestamp timestamp, JsonGenerator generator,
		SerializerProvider provider) throws IOException {
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a z");
	generator.writeString(formatter.format(timestamp));
}
 
}
