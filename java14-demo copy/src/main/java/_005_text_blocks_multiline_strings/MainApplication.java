package _005_text_blocks_multiline_strings;

public class MainApplication {
    public static void main(String[] args) {
        String myJSON = "{\n" +
                "    \"name\": \"Katerina\",\n" +
                "    \"username\": \"katerina\",\n" +
                "    \"role\": [\"user\"],\n" +
                "    \"password\": \"123456789\"\n" +
                "}";

        System.out.println(myJSON);

        System.out.println("--------------------------------------");

        String myJSON2 = """
                {
                    "name": "Katerina",
                    "username": "katerina",
                    "role": ["user"],
                    "password": "123456789"
                }
                """;
        System.out.println(myJSON2);

    }
}
