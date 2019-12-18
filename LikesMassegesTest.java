class LikesMassegesTest{
    @Test
    public void whoLikesIt(){
       // LikesMasseges likeMsgs = new LikesMasseges();
        assertEquals("no one likes this",LikesMasseges.whoLikesIt());
        assertEquals("Ali likes this",LikesMasseges.whoLikesIt("Ali"));
        assertEquals("Asd, Mina like this",LikesMasseges.whoLikesIt("Asd","Mina"));
        assertEquals("Shafi, Fatemeh and Saber likes this",LikesMasseges.whoLikesIt("Shafi","Fatemeh","Saber"));
        assertEquals("Shafi,Fatemeh and 2 others like this",LikesMasseges.whoLikesIt("Ali","Saber","Shafi","Fatemeh","Asd","Mina"));
    }
    
}
    
    
