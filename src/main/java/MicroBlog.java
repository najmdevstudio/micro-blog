

class MicroBlog {
    public String truncate(String input)  {
        int[] b1 = input.codePoints().toArray();  //codepoints api converting it into int array here
        if(b1.length > 5)
           return new String(b1,0,5);
        else
           return input;
    }
}
