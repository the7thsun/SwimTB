package SwimTB.Commands;

import SwimTB.SwimTBConf;
import SwimTB.Teams.TeamArrays;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class Enroll extends ListenerAdapter {

    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        super.onMessageReceived(event);
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        Member author = event.getGuild().getMemberById(event.getAuthor().getId());
        if (args[0].equalsIgnoreCase(SwimTBConf.prefix + "e")) {
            assert author != null;
            if (author.getRoles().contains(event.getGuild().getRoleById(SwimTBConf.TORole))) {
                if(args[1].equalsIgnoreCase("tw-squad")){

                    if(args.length == 5) {

                        try {
                            TeamArrays.twSquads.teamAdd(event, new String[]{ event.getAuthor().getId(), args[2], args[3], args[4]}, "Treasure wars squads" );
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }else {
                        event.getChannel().sendMessage("Usage: tw-squad @teammate @teammate @teammate").queue();
                    }
                }else if (args[1].equalsIgnoreCase("tw-duo")){
                    if(args.length == 3) {

                        try {
                            TeamArrays.twDuos.teamAdd(event, new String[]{ event.getAuthor().getId(), args[2]}, "Treasure Wars Squads" );
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }else {
                        event.getChannel().sendMessage("Usage: tw-duo @teammate").queue();
                    }
                }else if (args[1].equalsIgnoreCase("tw-solo")){
                    if(args.length == 2) {

                        try {
                            TeamArrays.twSolos.teamAdd(event, new String[]{event.getAuthor().getId()}, "Treasure Wars Solos" );
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }else {
                        event.getChannel().sendMessage("Usage: tw-solo").queue();
                    }
                }else if (args[1].equalsIgnoreCase("sg-duo")) {
                    if (args.length == 2) {

                        try {
                            TeamArrays.sgDuos.teamAdd(event, new String[]{event.getAuthor().getId()}, "Survival Games Duos");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        event.getChannel().sendMessage("Usage: sg-duo @teammate").queue();
                    }
                }else if (args[1].equalsIgnoreCase("sg-solo")){
                    if(args.length == 2) {

                        try {
                            TeamArrays.sgDuos.teamAdd(event, new String[]{event.getAuthor().getId()}, "Survival Games Duos" );
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }else {
                        event.getChannel().sendMessage("Usage: sg-duo @teammate").queue();
                    }
            } else {
                event.getChannel().sendMessage("Sorry you do not have sufficient permissions").queue();

            }
        }




    }
}