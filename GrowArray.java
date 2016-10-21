/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sultan
 */

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
        g.set(9,"cope");
        g.set(13,"Sonia Darling ");
        for (int i = 0; i < g.size; i++) {
            System.out.println(i + ": " + g.get(i));
        }

    }
    public void set(int e,String data)
    {
        if(contents.length<=e) 
        {
           String[]copyData=new String[e];
            for (int i = 0; i < contents.length; i++) 
            {
                copyData[i]=contents[i];
                               
            }
           
            contents=new String[e];
            for (int i = 0; i < copyData.length; i++) 
            {
                      contents[i]=copyData[i];
            }
        
                    contents[e-1]=data;
                    size=e;
        }
            	else
        		contents[e]=data;	
    			
    	
    }
    
    
    
}

