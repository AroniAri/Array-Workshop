package se.lexicon;

public class ArraysStrings {


    private static String[] name = new String[0];


    public static int getSize(int[] array) {
        return array.length;
    }

    public class NameRepositoryw {

        private static String[] names = new String[0];


        public static int getSize() {
            // Implement getSize method
            return names.length;
        }


        public static void setNames(String[] names) {
            // Implement setNames method
            if (names == null) {
                NameRepository.names = new String[0];
            } else {
                NameRepository.names = names.clone();
            }
        }


        public static void clear() {
            // Implement clear method
            names = new String[0];
        }


        public static String[] findAll() {
            // Implement findAll method
            return names.clone();
        }


    }





        private static String[] names = new String[0];


        public static String find(String fullName) {
            // Implement find method
            for (String name : names) {
                if (name.equalsIgnoreCase(fullName)) {
                    return name;
                }
            }
            return null;
        }


        public static boolean add(String fullName) {
            // Implement add method
            if (find(fullName) != null) {
                return false;
            }
            String[] newNames = new String[names.length + 1];
            System.arraycopy(names, 0, newNames, 0, names.length);
            newNames[names.length] = fullName;
            names = newNames;
            return true;
        }

        // Other methods...



    public class NameRepository {

        private static String[] names = new String[0];


        public static String[] findByFirstName(String firstName) {
            // Implement findByFirstName method
            return Arrays.stream(names)
                    .filter(name -> name.split(" ")[0].equalsIgnoreCase(firstName))
                    .toArray(String[]::new);
        }


        public static String[] findByLastName(String lastName) {
            // Implement findByLastName method
            return Arrays.stream(names)
                    .filter(name -> name.split(" ")[1].equalsIgnoreCase(lastName))
                    .toArray(String[]::new);
        }


        public static boolean update(String original, String updatedName) {
            // Implement update method
            int index = -1;
            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(original)) {
                    index = i;
                    break;
                }
            }
            if (index == -1 || find(updatedName) != null) {
                return false;
            }
            names[index] = updatedName;
            return true;
        }

        // Other methods...
    }


    public class NameRepository {

        private static String[] names = new String[0];

        // PART 1, PART 2, and PART 3 methods...


        public static boolean remove(String fullName) {
            // Implement remove method
            int index = -1;
            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(fullName)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                return false;
            }
            String[] newNames = new String[names.length - 1];
            System.arraycopy(names, 0, newNames, 0, index);
            System.arraycopy(names, index + 1, newNames, index, names.length - index - 1);
            names = newNames;
            return true;
        }


    }

}















