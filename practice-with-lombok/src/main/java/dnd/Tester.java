package dnd;

import java.util.HashMap;

public class Tester
{
    public static void main(String[] args)
    {
        DNDCharacter character = DNDCharacter.builder()
            .name("Trogdor")
            .backStory("He's the burninator")
            .stats(new HashMap<String, Object>())
            .build();

        DNDCharacter another = new DNDCharacter();

        System.out.println(character.toString());
    }
}
