package SwimTB.Commands;

import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class TWSquadsadd extends ListenerAdapter {

/*
    public void teamAdd(MessageReceivedEvent event, String tM1, String tM2, String tM3, String tM4) {

        if (TWsquadsTeam.teamNum == 1){
            TWsquadsTeam.team1[0] = tM1;
            TWsquadsTeam.team1[1] = tM2;
            TWsquadsTeam.team1[2] = tM3;
            TWsquadsTeam.team1[3] = tM4;
            TWsquadsTeam.teamNum++;

        }else if (TWsquadsTeam.teamNum == 2){
            TWsquadsTeam.team2[0] = tM1;
            TWsquadsTeam.team2[1] = tM2;
            TWsquadsTeam.team2[2] = tM3;
            TWsquadsTeam.team2[3] = tM4;
            TWsquadsTeam.teamNum++;

        }else if (TWsquadsTeam.teamNum == 3){
            TWsquadsTeam.team3[0] = tM1;
            TWsquadsTeam.team3[1] = tM2;
            TWsquadsTeam.team3[2] = tM3;
            TWsquadsTeam.team3[3] = tM4;
            TWsquadsTeam.teamNum++;

        }else if (TWsquadsTeam.teamNum == 4){
            TWsquadsTeam.team4[0] = tM1;
            TWsquadsTeam.team4[1] = tM2;
            TWsquadsTeam.team4[2] = tM3;
            TWsquadsTeam.team4[3] = tM4;
            TWSquadsEmbedBuild(event);

            event.getChannel().sendMessage("starting New Set").queue();
            TWsquadsTeam.teamNum = 1;

        }else{
            event.getChannel().sendMessage("Error").queue();
            TWsquadsTeam.teamNum = 1;
        }

    }

    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        super.onMessageReceived(event);
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        Member author = event.getGuild().getMemberById(event.getAuthor().getId());
        if (args[0].equalsIgnoreCase(SwimTBConf.prefix + "tw-s")) {
            assert author != null;
            if (author.getRoles().contains(event.getGuild().getRoleById(SwimTBConf.TORole))) {
                if(args.length == 4) {
                    teamAdd(event, event.getAuthor().getId(), args[1], args[2], args[3]);
                }else {
                    event.getChannel().sendMessage("Usage: !tw-s @teammate @teammate @teammate").queue();
                }

            } else {
                event.getChannel().sendMessage("Sorry you do not have sufficient permissions " + event.getMember().getAsMention()).queue();

            }
        }
    }

    public void TWSquadsEmbedBuild(MessageReceivedEvent event){

        String team1Mention = "",team2Mention = "",team3Mention = "",team4Mention = "";
        for (int i=0; i<4; i++) {
            Member team1 = event.getGuild().getMemberById(TWsquadsTeam.team1[i].replace("<@!", "").replace(">", ""));
            Member team2 = event.getGuild().getMemberById(TWsquadsTeam.team2[i].replace("<@!", "").replace(">", ""));
            Member team3 = event.getGuild().getMemberById(TWsquadsTeam.team3[i].replace("<@!", "").replace(">", ""));
            Member team4 = event.getGuild().getMemberById(TWsquadsTeam.team4[i].replace("<@!", "").replace(">", ""));
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

    }


*/

    }

