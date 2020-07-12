package SwimTB;

import SwimTB.Commands.Enroll;
import SwimTB.Commands.TWSquadsadd;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

@SuppressWarnings("deprecation")
public class Main {

    public static JDA jda;


    public static void main(String[] args){
        //login as bot
        try {
            jda = new JDABuilder(AccountType.BOT).setToken("NzMxMzQwMzY0ODIwMTE5NTc0.XwkoPg.0q-2qd3-fMnNI2obyxlkavDULkU").build();
        } catch (LoginException e) {
            e.printStackTrace();
        }

        //Declare commands
        jda.addEventListener(new Enroll());


    }
}
