

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    public void EveryBranch() {
        RuntimeException ex;

        User us1= new User(null,"12345678@","user@email.com");
        User us2= new User("12345678@","1234568@","user@email.com");
        ArrayList<User> users = new ArrayList<>();
        users.add(us1);
        users.add(us2);
        ex = assertThrows(RuntimeException.class,()->SILab2.function(null,users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        assertEquals(SILab2.function(us1,users),false);
        assertEquals(SILab2.function(us2,users),false);
        assertEquals(SILab2.function(new User("12345678@","12345678","user@email.com"),users),false);
        assertEquals(SILab2.function(new User("12345678@","1234567 8","useremailcom"),users),false);
    }
    @Test
    public void MultipleCondition(){
        RuntimeException ex;
        User us1 = new User("Tane","12345678@","tane@email.com");
        User us2 = new User("Tane","zazazazazaza","tane123@sks.com");
        ArrayList<User> users = new ArrayList<>();
        users.add(us1);
        users.add(us2);

        // ALL FALSE
        assertEquals(SILab2.function(new User("Tane","password1234","tanco@email.com"),users),false);

        //F||F||T user(Tane,password123,null)
        ex=assertThrows(RuntimeException.class,()->SILab2.function(new User("Tane","123456789",null),users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        // F||T||T user(Tane,null,null)
        ex=assertThrows(RuntimeException.class,()->SILab2.function(new User("Filip",null,null),users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        // T||T||T-user=null
        ex=assertThrows(RuntimeException.class,()->SILab2.function(null,users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

    }
}