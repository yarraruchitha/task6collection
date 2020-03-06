package epam_task6;
import java.util.Arrays;
public class Datalist <lis> {

	private int size=0;

	private static final int CAPACITY=10;

	private Object list_elements[];

	public Datalist()

	{

        list_elements = new Object[CAPACITY];

    }

	public void add(lis data)

	{

		if (size == list_elements.length) {

            ensureCapacity();

        }

		list_elements[size++]=data;

	}

	public int size()

	{

		return size;

	}

	public lis remove(int i)

	{

		if (i >= size || i < 0) {

            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);

        }

		 Object list_item = list_elements[i];

	        int num_of_Elts = list_elements.length - ( i + 1 ) ;

	        System.arraycopy( list_elements, i + 1, list_elements, i, num_of_Elts ) ;

	        size--;

	        return (lis) list_item;

	}

	public lis get(int i) {

		if (i >= size || i < 0) {

            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);

        }

        return (lis) list_elements[i];

    }

	public String toString() 

    {

         StringBuilder sb = new StringBuilder();

         sb.append('[');

         for(int i = 0; i < size ;i++) {

             sb.append(list_elements[i].toString());

             if(i<size-1){

                 sb.append(",");

             }

         }

         sb.append(']');

         return sb.toString();

    }

	private void ensureCapacity() {

        int newSize = list_elements.length * 2;

        list_elements = Arrays.copyOf(list_elements, newSize);

    }

}
