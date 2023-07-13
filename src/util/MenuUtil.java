package util;

public class MenuUtil {
    public static Integer firstEntry() {
        System.out.println(
                """

                        ----------| FootBaller Transfer System |----------
                        1. Register
                        2. Login
                        """
        );
        return InputUtil.inputTypeInteger("Select option:");
    }

    public static Integer registerMenu() {
        System.out.println(
                """

                        ---Which one will you be registered as?---
                        1. Sporting Director
                        2. Football Player
                        """
        );
        return InputUtil.inputTypeInteger("Select option:");
    }

    public static Integer sportingDirectorMenu() {
        System.out.println(
                """

                        ----------| FootBaller Transfer System |----------
                        1. Show Players
                        2. Show Soccer Teams
                        3. To Advertise Team
                        4. Exit
                        """
        );

        return InputUtil.inputTypeInteger("Select option:");
    }

    public static Integer playerMenu() {
        System.out.println(
                """

                        ----------| FootBaller Transfer System |----------
                        1. Show Players
                        2. Show Soccer Teams
                        3. Exit
                        """

        );
        return InputUtil.inputTypeInteger("Select option:");
    }

    public static Integer playerWithPosition() {
        System.out.println(
                """

                        ----- Choose which one you want to see -----
                        1. Show All Players
                        2. Show Goalkeepers
                        3. Show Defenders
                        4. Show Forwards
                        5. Back
                        """
        );

        return InputUtil.inputTypeInteger("Select option:");
    }
}


