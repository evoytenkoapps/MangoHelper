package evoytenkoapps.mangohelper.ru;


public class Lessons
{   
// 0 - название урока, 1 - текст главной подсказки, 2- текст итога в завершающем диалоге
    public static final String[][] sLessonsStrings ={
        {"Прием звонков на сотовый",
                "Чтобы установить переадресацию на телефонный номер из главного меню, зайдите в раздел \"Голосовое меню и распределение звонков\"",
                "Удалите из схемы распределения звонков \"Звуковое приветствие\""," Затем удалите \"Прием факса\"","Нажмите на \"не указано\" в пункте \"Переадресация\"",
                "Нажмите на \"Внешний номер\"","Введите телефонный номер и нажмите \"Добавить\".",
                "Номер добавлен в схему переадресации, теперь вы будете принимать на него звонки."
        },
        {"Создать сотрудника",
                "Сотрудник является важным элементом в работе ВАТС. Для создания сотрудника необходимо из главного меню зайти в раздел \"Сотрудники и группы\".",
                "Затем зайдите в раздел \"Добавить сотрудника\"","Задайте сотруднику: имя, добавочный номер, выберите прием звонков на другой номер и укажите его",
                "Сотрудник с данным контактом создан. Теперь можно использовать его в схеме переадресации."},
        {"Прием звонков на сотрудника",
                "Чтобы установить прием звонков на сотрудника, необходимо настроить на него в схему переадресации. Для этого из главного меню зайдите в раздел \"Голосовое меню и распределение звонков\"",
                "Нажмите на номер, указанный в переадресации, либо на слово \"не указано\"",
                "Выберите сотрудника \"Сергей склад\" и нажмите \"Добавить\"",
                "Сотрудник \"Сергей склад\" добавлен в схему переадресации, теперь он будет принимать входящие звонки."
        },
        {"Создать SIP учетную запись",
                "Для создания SIP учетной записи вам необходим сотрудник. Зайдите в раздел \"Сотрудники и группы\".",
                "Выберите сотрудника, в данном уроке это \"Сергей склад\"",
                "Напротив поля \"SIP-адрес\" нажмите на \"Создать\"",
                "В поле \"SIP-адрес\" введите имя учетной записи, например: \"sergey\", в поле \"Пароль\" задайте пароль для учетной записи",
                "У сотрудника создана учетная запись."
        },
        {"Настроить прием звонков на телефон Gigaset С610",
                "Для того, чтобы настроить SIP-телефон, вам необходимо знать имя учетной записи, ее домен и пароль. Чтобы их узнать, из главного меню зайдите в раздел \"Сотрудники и группы\".",
                "Зайдите в сотрудника \"Сергей склад\"",
                "Нажмите на название SIP учетной записи \"sergey\"",
                "Запишите имя сотрудника из поля \"SIP-адрес\", в данном случае \"sergey\". Запишите домен \"vpbx400070052.mangosip.ru\". Чтобы узнать пароль учетной записи, нажмите на поле \"Показать\"",
                "Теперь вы знаете имя учетной записи, ее домен и пароль. Далее приступим к настройке телефона. Для этого нажмите \"Отменить\"",
                "Необходимо зайти в настройки телефона Gigaset С610 и настроить его. Для этого необходимо на трубке войти в \"Меню > Настройки > Система > Локальная сеть (Местная сеть) > IP-адрес\". Введите данный адрес в браузер. Введите PIN-код \"0000\"",
                "Зайдите в раздел \"Настройки\"",
                "Затем в \"Телефония\"",
                "Нажмите \"Правка\"",
                "Затем \"Показать доп. настройки\"",
                "На данной странице вам необходимо заполнить поля. В поле \"Имя или номер соединения:\" введите название вашей учетной записи , которое вы записали из карточки сотрудника \"sergey\".",
                "В поле \"Имя для входа в систему:\" введите имя \"sergey\".",
                "В поле \"Пароль для входа в систему:\" введите имя \"password\".",
                "В поле \"Имя пользователя:\" введите имя \"sergey\".",
                "В поле \"Отображ. имя:\" введите имя \"sergey\".",
                "В поле \"Домен\" введите домен вашей учетной записи, который вы записали из карточки сотрудника  \"vpbx400070052.mangosip.ru\".",
                "В поле \"Адрес прокси-сервера:\" введите домен \"vpbx400070052.mangosip.ru\".",
                "В поле \"Порт прокси-сервера:\" введите порт \"60000\".",
                "В поле \"Сервер регистрации:\" введите домен \"vpbx400070052.mangosip.ru\".",
                "В поле \"Порт сервера регистрации:\" введите  порт \"60000\".",
                "В поле \"Время обновления регистрации:\" введите время сек. \"480\".",
                "Нажмите \"Настроить\"",
                "Телефон Gigaset С610 настроен. Если вы добавите сотрудника \"Сергей склад\" в схему переадресации, звонки будут приходить на данный телефонный аппарат Gigaset С610."
        },
        {"Создать группу",
                "Группа позволяет объединять сотрудников и распределять на них звонки одновременно. Для создания группы зайдите из главного меню в раздел \"Сотрудники и группы\".",
                "Зайдите в раздел \"Группы обзвона\"",
                "Нажмите \"Добавить группу\"",
                "Задайте группе название, для этого нажмите на \"Карандаш\" сверху. Задайте группе внутренний номер",
                "Затем выберите алгоритм обзвона сотрудников",
                "Нажмите сохранить, чтобы настройки применились.",
                "Группа создана."
        },
        {"Добавить сотрудника в группу",
                "Объединяя сотрудников в группу, вы можете управлять алгоритмом распределения звонков на них. Для добавления сотрудников в группу зайдите из главного меню в раздел \"Сотрудники и группы\".",
                "Зайдите в раздел \"Группы обзвона\"",
                "Нажмите \"Добавить сотрудников\"",
                "Нажмите на сотрудника \"Сергей\" или на квадрат рядом с ним.",
                "Нажмите \"Добавить\".",
                "Сотрудник добавлен в группу."
        }
};


}
