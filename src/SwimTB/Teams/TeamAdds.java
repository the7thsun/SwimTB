package SwimTB.Teams;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

public class TeamAdds {


    //TW Squads
    public void tWSquadadd(MessageReceivedEvent event, String tM1, String tM2, String tM3, String tM4) {

        if (TeamArrays.teamNum == 1){
            TeamArrays.team1[0] = tM1;
            TeamArrays.team1[1] = tM2;
            TeamArrays.team1[2] = tM3;
            TeamArrays.team1[3] = tM4;
            TeamArrays.teamNum++;

        }else if (TeamArrays.teamNum == 2){
            TeamArrays.team2[0] = tM1;
            TeamArrays.team2[1] = tM2;
            TeamArrays.team2[2] = tM3;
            TeamArrays.team2[3] = tM4;
            TeamArrays.teamNum++;

        }else if (TeamArrays.teamNum == 3){
            TeamArrays.team3[0] = tM1;
            TeamArrays.team3[1] = tM2;
            TeamArrays.team3[2] = tM3;
            TeamArrays.team3[3] = tM4;
            TeamArrays.teamNum++;

        }else if (TeamArrays.teamNum == 4){
            TeamArrays.team4[0] = tM1;
            TeamArrays.team4[1] = tM2;
            TeamArrays.team4[2] = tM3;
            TeamArrays.team4[3] = tM4;
            TWSquadsEmbedBuild(event);

            event.getChannel().sendMessage("starting New Set").queue();
            TeamArrays.teamNum = 1;

        }else{
            event.getChannel().sendMessage("Error").queue();
            TeamArrays.teamNum = 1;
        }

    }

    public void TWSquadsEmbedBuild(MessageReceivedEvent event){

        String team1Mention = "",team2Mention = "",team3Mention = "",team4Mention = "";
        for (int i=0; i<4; i++) {
            Member team1 = event.getGuild().getMemberById(TeamArrays.team1[i].replace("<@!", "").replace(">", ""));
            Member team2 = event.getGuild().getMemberById(TeamArrays.team2[i].replace("<@!", "").replace(">", ""));
            Member team3 = event.getGuild().getMemberById(TeamArrays.team3[i].replace("<@!", "").replace(">", ""));
            Member team4 = event.getGuild().getMemberById(TeamArrays.team4[i].replace("<@!", "").replace(">", ""));
            team1Mention += team1.getAsMention() + " ";
            team2Mention += team2.getAsMention() + " ";
            team3Mention += team3.getAsMention() + " ";
            team4Mention += team4.getAsMention() + " ";
        }

        EmbedBuilder TWsEB = new EmbedBuilder()
                .setTitle("Teams")
                .addField("**Team 1**","Players" + team1Mention, false)
                .addField("**Team 2**","Players" + team2Mention, false)
                .addField("**Team 3**","Players" + team3Mention, false)
                .addField("**Team 4**","Players" + team4Mention, false)
                .setColor(Color.CYAN);
        event.getGuild().getTextChannelById("731319088072097846").sendMessage(TWsEB.build()).queue();



        //TW duos

    }



}
