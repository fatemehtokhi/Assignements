

class LikesMasseges{
    public static String whoLikesIt(String... names){
        int lent = names.length;
        String msg = "";
        switch(lent){
            case 0:
                msg = "no one likes this";
                break;
            case 1:
                msg = names[0]+ " likes this";
                break;
            case 2:
                msg = names[0]+" and "+names[1]+" like this";
                break;
            case 3:
                msg = names[0]+", "+names[1]+" and "+names[2]+" like this";
                break;
            case 4:
                msg = names[0]+", "+names[1]+" and 2 others like this";
                break;
            default:
                msg = names[0]+", "+names[1]+" and "+(lent-2)+" others like this";

        }
        return msg;

    }
    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Ali"));
        System.out.println(whoLikesIt("Ali", "ASd"));
        System.out.println(whoLikesIt("Ali", "Asd", "Mina"));
        System.out.println(whoLikesIt("Ali", "Asd", "Mina", "Mohammad"));
        System.out.println(whoLikesIt("Ali", "Asd", "Mina", "Mohammad", "Akbar"));
        System.out.println(whoLikesIt("Ali", "Asd", "Mina","Mohammad","Akbar","shafi"));
        
    }
    
}



