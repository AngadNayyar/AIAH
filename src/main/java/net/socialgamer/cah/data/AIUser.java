package net.socialgamer.cah.data;

/**
 * Created by harry on 28/05/2017.
 */
    public class AIUser extends User{


    /**
     * Create a new user.
     *
     * @param nickname The user's nickname.
     * @param hostName The user's Internet hostname (which will likely just be their IP address).
     * @param isAdmin
     */
    public AIUser(String nickname, String hostName, boolean isAdmin) {
        super(nickname, hostName, isAdmin);
    }


}
