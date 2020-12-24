package guru.learningjournal.kafka.examples;

class Cleaner {
    static TwitterClean getNotification(Twitter twitter) {
        TwitterClean twitterClean = new TwitterClean();
        twitterClean.setId(twitter.getPayload().getId());
        twitterClean.setCreatedAt(twitter.getPayload().getCreatedAt());
        twitterClean.setLang(twitter.getPayload().getLang());
        twitterClean.setRetweetCount(twitter.getPayload().getRetweetCount());
        twitterClean.setSource(twitter.getPayload().getSource());
        twitterClean.setText(twitter.getPayload().getText());
        if(twitter.getPayload().getText().toUpperCase().contains("BTS")){
            twitterClean.setArtist("BTS");
        }
        else if(twitter.getPayload().getText().toUpperCase().contains("BLACKPINK")){
            twitterClean.setArtist("BLACKPINK");
        }
        else if(twitter.getPayload().getText().toUpperCase().contains("NCT")){
            twitterClean.setArtist("NCT");
        }
        else if(twitter.getPayload().getText().toUpperCase().contains("IU")){
            twitterClean.setArtist("IU");
        }
        else if(twitter.getPayload().getText().toUpperCase().contains("TWICE")){
            twitterClean.setArtist("TWICE");
        }
        else if(twitter.getPayload().getText().toUpperCase().contains("VELVET")){
            twitterClean.setArtist("RED VELVET");
        }
        else if(twitter.getPayload().getText().toUpperCase().contains("OHMYGRIL")){
            twitterClean.setArtist("OHMYGIRL");
        }
        else if(twitter.getPayload().getText().toUpperCase().contains("BTOB")){
            twitterClean.setArtist("BTOB");
        }
        else if(twitter.getPayload().getText().toUpperCase().contains("EXO")){
            twitterClean.setArtist("EXO");
        }
        else if(twitter.getPayload().getText().toUpperCase().contains("IZONE")){
            twitterClean.setArtist("IZONE");
        }
        else{
            twitterClean.setArtist("Not Defined");
        }
        return twitterClean;

    }
}
