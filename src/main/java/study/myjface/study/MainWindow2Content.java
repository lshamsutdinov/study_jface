package study.myjface.study;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

/**
 * Создание содержимого окна.
 * 
 * @author MIRAGE
 *
 */
public class MainWindow2Content extends ApplicationWindow {

	public static void main(String[] args) {

		MainWindow2Content window = new MainWindow2Content(); // Создаем наше окно
		window.setBlockOnOpen(true); // Устанавливаем флаг - ждать закрытия окна
		window.open(); // Открываем окно
		Display.getCurrent().dispose(); // Освобождаем ресурсы

	}

	public MainWindow2Content() {
		super(null); // Вызываем конструктор родительского класса
	}

	// Для того, чтобы создать какое-то содержимое окна, необходимо
	// переопределить метод Control createContents( Composite parent ) класса
	// ApplicationWindow. Метод должен возвращать компонент, который будет
	// являться содержимым окна.
	@Override
	protected Control createContents(Composite parent) {
		getShell().setText("My window"); // Устанавливаем заголовок окна
		Label lbl = new Label(parent, SWT.NONE); // Создаем новый элемент, в
													// нашем случае - просто
													// метку
		lbl.setText("Window contents"); // Устанавливаем ей текст
		lbl.setBackground(new Color(Display.getCurrent(), 255, 255, 255)); // Устанавливаем
																			// белый
																			// цвет
																			// фона
		return lbl;
	}
}