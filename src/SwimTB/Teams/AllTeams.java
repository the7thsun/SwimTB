package SwimTB.Teams;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.Objects;

public class AllTeams {

    int numberOfTeams;
    int numberPerTeam;
    int teamNum;

    String[][] teams;

    public AllTeams(int numberOfTeams, int numberPerTeam)
    {
        teamNum = 0;
        this.numberOfTeams = numberOfTeams;
        this.numberPerTeam = numberPerTeam;

        teams = new String[numberOfTeams][numberPerTeam];
    }

    //TW Squads
    public void teamAdd(MessageReceivedEvent event, String[] teamMembers, String gameType) throws Exception {

        if(teamMembers.length != numberPerTeam) {
            throw new Exception("teamMembers.length should equal numberPerTeam");
        }

        if (teamNum == 0){
            teams[teamNum]= new String[numberPerTeam];
        }

        for (int i=0; i< numberPerTeam; i++) {
            teams[teamNum][i] = teamMembers[i].replace("<@!", "").replace(">", "");
        }
        teamNum ++;

        if(teamNum == numberOfTeams) {
            teamsEmbedBuild(event, gameType);

            event.getChannel().sendMessage("starting New Set").queue();
            teamNum = 0;
        }

        event.getMessage().addReaction("✅").queue();
    }

    public void teamsEmbedBuild(MessageReceivedEvent event, String gameType){

        String[] teamMentions = new String[numberOfTeams];
        for (int notI=0; notI<numberOfTeams; notI++) {
            teamMentions[notI] = "";
            for (int nptI=0; nptI<numberPerTeam ; nptI++) {
                Member person = event.getGuild().getMemberById(teams[notI][nptI]);
                assert person != null;
                teamMentions[notI] += person.getAsMention() + " ";
            }
        }

        EmbedBuilder TWsEB = new EmbedBuilder()
                .setTitle("Teams for " + gameType)
                .setColor(Color.CYAN);
        for (int i=0; i< numberOfTeams; i++) {
            TWsEB.addField("**Team " + (i + 1) +"**", teamMentions[i], false);
        }

        Objects.requireNonNull(event.getGuild().getTextChannelById("731319088072097846")).sendMessage(TWsEB.build()).queue();



        //TW duos

    }



}
