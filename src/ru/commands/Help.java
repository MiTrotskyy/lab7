package ru.commands;

import ru.general.User;
import ru.general.human_being_controller.HumanBeingMap;

/**
 * Класс, реализующий команду help - вывод справки
 */

public class Help extends Command{

    /**
     * Вывод справки
     * @param humanBeingMap класс с коллекцией, над которой производятся действия
     */
    @Override
    public void execute(HumanBeingMap humanBeingMap) {
        setMessage("help                             - вывести справку по доступным командам\n" +
                "info                             - вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                "show                             - вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                "insert key {element}             - добавить новый элемент с заданным ключом\n" +
                "update id {element}              - обновить значение элемента коллекции, id которого равен заданному\n" +
                "remove_key key                   - удалить элемент из коллекции по его ключу\n" +
                "clear                            - очистить коллекцию\n" +
//                "save                             - сохранить коллекцию в файл\n" +
                "execute_script file_name         - считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                "exit                             - завершить программу (без сохранения в файл)\n" +
                "remove_greater id                - удалить из коллекции все элементы, превышающие заданный\n" +
                "remove_lower id                  - удалить из коллекции все элементы, меньшие, чем заданный\n" +
                "remove_greater_key null          - удалить из коллекции все элементы, ключ которых превышает заданный\n" +
                "filter_by_mood mood              - вывести элементы, значение поля mood которых равно заданному\n" +
                "filter_greater_than_car car_name - вывести элементы, значение поля car которых больше заданного\n" +
                "print_descending                 - вывести элементы коллекции в порядке убывания\n");
    }

    @Override
    public boolean isValid() {
        return true;
    }
}