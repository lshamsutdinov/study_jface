package study.myjface.study;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

/**
 * Создание меню.
 * 
 * При добавлении пунктов меню после запуска приложения они не появляются -
 * чтобы изменения меню после создания окна отобразились на нем, необходимо
 * вызвать метод getMenuBarManager().update( true ) - указать обновить панель
 * меню.
 * 
 * @author MIRAGE
 *
 */
public class MainWindow4Menu extends ApplicationWindow {

	public static void main(String[] args) {

		MainWindow4Menu window = new MainWindow4Menu(); // Создаем наше окно
		window.setBlockOnOpen(true); // Устанавливаем флаг - ждать закрытия окна

		window.open(); // Открываем окно
		Display.getCurrent().dispose(); // Освобождаем ресурсы

	}

	public MainWindow4Menu() {
		super(null); // Вызываем конструктор родительского класса

		addStatusLine(); // Добавление к окну приложения статусной строки

		createMenu(); // Добавление панели меню и создание ее компонентов.
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

		setStatus("SuperStatus"); // Отображение текста в статусной строке

		return lbl;
	}

	// Метод для добавления панели меню и создании ее компонентов.
	private void createMenu() {

		addMenuBar(); // Добавляем панель меню

		MenuManager fileMenu = new MenuManager("&File"); // Создаем новое меню
		getMenuBarManager().add(fileMenu); // Добавляем меню на панель
		fileMenu.add(new Separator()); // Добавляем разделитель в меню

		fileMenu.add(new Action("&Hello") { // Создаем новое действие, указываем
											// его текст

			@Override
			public void run() { // Код выполняемый при активации действия
				setStatus("Hello world!!"); // Мы просто отображаем новое
											// значение в статусной строке
			}
		});

	}

}