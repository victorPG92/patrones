package generadorDtos.prueba.mapper;

import generadorDtos.mapper.FormaterJsonDots;
import generadorDtos.mapper.FormaterJsonDotsIt;
import generadorDtos.mapper.FormaterJsonDotsKeys;
import generadorDtos.mapper.FormaterJsonDotsPadre;

public class JsonMapperDotTest
{

	public static void main(String[] args)
	{
		FormaterJsonDotsPadre f = new FormaterJsonDotsKeys();
		
		
		f.formatJson2Dot("{\r\n"
				+ "  \"data\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": \"5733\",\r\n"
				+ "      \"resolutionTerm\": \"Fuera de plazo\",\r\n"
				+ "      \"participant\": {\r\n"
				+ "        \"identityDocument\": {\r\n"
				+ "          \"documentNumber\": \"21987225J\"\r\n"
				+ "        }\r\n"
				+ "      },\r\n"
				+ "      \"account\": {\r\n"
				+ "        \"number\": \"ES6621000418401234567891\"\r\n"
				+ "      },\r\n"
				+ "      \"overdraft\": {\r\n"
				+ "        \"overdraftDate\": \"2023-06-01\",\r\n"
				+ "        \"overdraftAmount\": {\r\n"
				+ "          \"amount\": 137.53,\r\n"
				+ "          \"currency\": \"EUR\"\r\n"
				+ "        }\r\n"
				+ "      },\r\n"
				+ "      \"defaultDate\": \"2023-09-01\",\r\n"
				+ "      \"task\": {\r\n"
				+ "        \"registrationStatus\": {\r\n"
				+ "          \"id\": \"10\",\r\n"
				+ "          \"description\": \"Registrado\"\r\n"
				+ "        },\r\n"
				+ "        \"robotStatus\": {\r\n"
				+ "          \"id\": \"4\",\r\n"
				+ "          \"description\": \"Procesando robot\"\r\n"
				+ "        }\r\n"
				+ "      },\r\n"
				+ "      \"isEditable\": false\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}", "listOverdrawnAccountInfo")
		.forEach(System.out::println);
		
		
	}
}
