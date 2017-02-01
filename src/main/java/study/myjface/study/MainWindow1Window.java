package study.myjface.study;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Display;

/**
 * Создание окна.
 * 
 * @author MIRAGE
 *
 */
public class MainWindow1Window extends ApplicationWindow {

	public static void main(String[] args) {

		MainWindow1Window window = new MainWindow1Window(); // Создаем наше окно
		window.setBlockOnOpen(true); // Устанавливаем флаг - ждать закрытия окна
		window.open(); // Открываем окно
		Display.getCurrent().dispose(); // Освобождаем ресурсы

	}

	public MainWindow1Window() {
		super(null); // Вызываем конструктор родительского класса
	}
}