package core.themes.files;

import java.io.Console;
import java.io.IOException;

public class ConsoleDemo {
	public static void main(String[] args) throws IOException {

		Console console = System.console();
		if (console != null) {

			String login = console.readLine("Введите логин:");
			char[] password = console.readPassword("Введите пароль:");

			console.printf("Введенный логин: %s \n", login);
			console.printf("Введенный пароль: %s \n", new String(password));
		}
	}
}