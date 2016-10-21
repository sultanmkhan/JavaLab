package University;
public class GrowArray
{
    // the size of the array
    private int size;
    // its contents
    private String[] contents;

    public GrowArray() {
        size = 0;
        contents = new String[2];
    }

    public int size() {
        return size;
    }

    public String get(int i) {
        if (i >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return contents[i];
    }

    public void add(String s) {
        if (size < contents.length) {
            contents[size] = s;
            size++;
        } else {
            String[] contents2 = new String [size*2];

            for (int i = 0; i < contents.length; i++) {
                contents2[i] = contents[i];
            }

            contents2[size] = s;
            size++;
            contents = contents2;
        }
    }

    // Some simple tests
    public static void main(String[] args) {
        GrowArray g = new GrowArray();
        g.add("a");
        g.add("b");
        g.add("c");
        g.add("d");
        //g.set(9,"cope");
        for (int i = 0; i < g.size; i++) {
            System.out.println(i + ": " + g.get(i));
        }

    }
    public void set(int e,String data)
    {
        if(contents.length<=e) 
            	contents=new String[e*2];
            	else
        		contents[e]=data;	
    			
    	
    }
    
    
    
}
