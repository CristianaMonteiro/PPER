package myutil;

/**
 *
 * @author Cris
 */
public class ContainerOfObjects {

    private final int SIZE = 100;
    private Object objects[];

    /**
     * Method responsible for creating an instance of ContainerOfObjects with an
     * array received by parameter
     *
     * @param objects array of objects
     */
    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
    }

    /**
     * Method responsible for creating an instance of ContainerOfObject with an
     * array with size received by parameter
     *
     * @param size array size
     */
    public ContainerOfObjects(int size) {
        objects = new Object[size];
    }

    /**
     * Method responsible for creating an instance of ContainerOfObjects with an
     * array with default size
     */
    public ContainerOfObjects() {
        objects = new Object[SIZE];
    }

    /**
     * Method responsible for returning the objects array
     *
     * @return the objects array
     */
    public Object[] getObjects() {
        return objects;
    }

    /**
     * Method responsible for returning an object in the position passed by
     * parameter
     *
     * @param pos object position
     * @return the object
     */
    public Object getObjects(int pos) {
        return objects[pos];
    }

    /**
     * Method responsible for set the objects array with the array passed by
     * parameter
     *
     * @param objects the new array
     */
    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    /**
     * Method responsible for returning the amount of non null positions of the
     * objects array
     *
     * @return the amount of non null positions of the objects array
     */
    public int arraySize() {

        int count = 0;

        while (count < objects.length && objects[count] != null) {
            count++;
        }

        return count;

    }

    /**
     * Method responsible for placing all the non null positions to the left of
     * the array
     */
    public void sort() {

        int i = 0;
        int j;

        while (i < objects.length) {

            if (objects[i] == null) {
                j = i;

                while (objects[j] == null && j < objects.length - 1) {
                    j++;
                }

                if (j < objects.length) {
                    objects[i] = objects[j];
                    objects[j] = null;
                } else {
                    i = objects.length;
                }

            }

            i++;

        }

    }

    /**
     * Method responsible for add an object to the objects array
     *
     * @param newObject object to add to the array
     * @return the success ou unsuccess of the operation
     */
    public boolean addObject(Object newObject) {

        int position = arraySize();

        if (position >= objects.length) {
            return false;
        } else {
            objects[position] = newObject;
            return true;
        }

    }

    /**
     * Method responsible for removing an object of the array
     *
     * @param position position of the object to remove
     * @return the removed object
     */
    public Object removeObject(int position) {

        Object obj = null;

        if (position < objects.length && position >= 0 && objects[position] != null) {
            obj = objects[position];
            objects[position] = null;
            sort();
        }

        return obj;
    }

    /**
     * Method responsible for replacing an object in the array
     *
     * @param position the position of object to replace
     * @param newObject the object to replace
     * @return the success ou unsuccess of the operation
     */
    public boolean setObjects(int position, Object newObject) {

        if (position < objects.length && position >= 0 && objects[position] != null) {
            objects[position] = newObject;
            return true;
        }
        return false;
    }

    /**
     * Method responsible for finding an object
     *
     * @param obj object to find
     * @return the index of the object, in case of not found, returns -1
     */
    public int findObject(Object obj) {

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null && objects[i].equals(obj)) {
                return i;
            }
        }

        return -1;

    }

}
