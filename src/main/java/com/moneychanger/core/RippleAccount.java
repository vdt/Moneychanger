/************************************************************
-----BEGIN PGP SIGNED MESSAGE-----
Hash: SHA256

 *                 M O N E Y C H A N G E R
 *
 *  Open Transactions:
 *       Financial Cryptography and Digital Cash
 *       Library, Protocol, API, Server, and GUI 
 *    
 *    	 -- Anonymous Numbered Accounts.
 *    	 -- Untraceable Digital Cash.
 *    	 -- Triple-Signed Receipts.
 *    	 -- Cheques, Vouchers, Transfers, Inboxes.
 *    	 -- Basket Currencies, Markets, Payment Plans.
 *    	 -- Signed, XML, Ricardian-style Contracts.
 *    
 *  Copyright (C) 2010-2012 by "Fellow Traveler" (A pseudonym)
 *
 *  EMAIL:
 *  FellowTraveler@rayservers.net
 *  
 *  FINGERPRINT:
 *  9DD5 90EB 9292 4B48 0484  7910 0308 00ED F951 BB8E
 *
 *  BITCOIN:  1NtTPVVjDsUfDWybS4BwvHpG2pdS9RnYyQ
 *
 *  OFFICIAL PROJECT WIKI:
 *  https://github.com/FellowTraveler/Moneychanger
 *  https://github.com/FellowTraveler/Open-Transactions/wiki
 *
 *  WEBSITE:
 *  http://www.OpenTransactions.org/
 *    
 *  Components and licensing:
 *   -- Moneychanger..A Java client GUI.....LICENSE:.....GPLv3
 *   -- OTLib.........A class library.......LICENSE:...LAGPLv3 
 *   -- OT-API........A client API..........LICENSE:...LAGPLv3
 *   -- testwallet....Command-line client...LICENSE:...LAGPLv3
 *   -- OT-Server.....Server Application....LICENSE:....AGPLv3
 *  Github.com/FellowTraveler/Open-Transactions/wiki/Components
 *
 *  All of the above OT components were designed and written by
 *  Fellow Traveler, with the exception of Moneychanger, which
 *  was contracted out to Vicky C (livewire_3001@yahoo.com).
 *
 *  -----------------------------------------------------
 *
 *   LICENSE:
 *   This program is free software: you can redistribute it
 *   and/or modify it under the terms of the GNU General
 *   Public License as published by the Free Software
 *   Foundation, either version 3 of the License, or (at your
 *   option) any later version.
 *
 *   You should have received a copy of the GNU General
 *   Public License along with this program.  If not, see:
 *   http://www.gnu.org/licenses/
 *
 *   If you would like to use this software outside of the free
 *   software license, please contact FellowTraveler.
 *   (Unfortunately many will run anonymously and untraceably,
 *   so who could really stop them?)
 *   
 *   DISCLAIMER:
 *   This program is distributed in the hope that it will be
 *   useful, but WITHOUT ANY WARRANTY; without even the implied
 *   warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *   PURPOSE.  See the GNU General Public License for more
 *   details.
 
-----BEGIN PGP SIGNATURE-----
Version: GnuPG v1.4.11 (Darwin)

iQIcBAEBCAAGBQJOj7gfAAoJEAMIAO35UbuOs3sP/2rrjSdYu/AsXcgLK9/9CP4a
lIJfw3KLvybKZjZW5r5j+4xUlCYIqPZSI66PGDChGPMPFcZQN6M4Ddpn9kbctymS
sdTXvbdFhpbV6k2wSa1Fz97ygfXJc/7MDTmHYbZ53hVV8AoUBrCHWtVttkQD31o3
Pn/qGmy+jOgTvjEXhjEpV66pDkMWze1SiI1MArHUziCYoxItuM45x0EfzwQIqlo3
ku2R7rRTtqm47Dgea12psWrjbPS5XRL1Q8Hs38Z1J0JdFlfn6cJYe52Iiluzof6M
kCLhy6FH8QfIADfrKkFP48EIhnVquDlkV9AlJ1r217K3cpK2jEjlZUnGBECMAMEo
pSXXk1BLNgxsa4yaXCgHY92/MhgtcdCMLkcCq6MWUTGZsLGiWIiQGmO9mwBfNIlY
SawlIviuS5DiE/D16A290Byxhha/5e144cIiKm27fSQra8eogUXNfZdZeuv6n69v
t8QjeBjoLhe5/KnRNoGLpSXhPphsWLRSJBru77ZU2msHfmkNfcP2UoEUCfNTfTbE
XpyRfeyRVowVKeKunV9KUSHgdD5wa6RUeyodAbaHvWrFpIpNkaFIP9OwhRULpjx0
arwVNYucbX1qb2I8HBm2u+IRWQTONp74TFFjU0/CVAXu2DeJKY5mL4zDej35c5j9
AK+ZirdWhhoHeWR1tAkN
=RcXP
-----END PGP SIGNATURE-----
 **************************************************************/

package com.moneychanger.core;

import com.wrapper.core.jni.RippleServer;
import com.wrapper.core.jni.WalletData;
import com.moneychanger.core.util.Configuration;
import com.moneychanger.core.util.Utility;

/**
 *
 * @author waqqas
 */
public class RippleAccount extends Account {

    @Override
    public boolean createAccount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteAccount(String accountID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editAccount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void loadAccount(String assetID, String serverID, String nymID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getAccountDetails(String accountID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean editLabel(String accountID, String newLabel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[] loadServerDetails(String serverID){

        String[] details = null;
        WalletData walletData = Utility.getWalletData();
        if (walletData == null) {
            System.out.println("loadServerDetails - walletData returns null");
            return null;
        }
        for (int i = 0; i < walletData.GetRippleServerCount(); i++) {
            RippleServer rippleServer = walletData.GetRippleServer(i);
            if (rippleServer == null) {
                continue;
            }
            System.out.println("serverID:" + serverID + " rippleServer.getServer_id():" + rippleServer.getServer_id());
            if (serverID.equals(rippleServer.getServer_id())) {
                details = new String[5];
                details[0] = rippleServer.getServer_host()==null?"":rippleServer.getServer_host();
                details[1] = rippleServer.getNamefield_id()==null || rippleServer.getNamefield_id().trim().length()<1 ?Configuration.getRippleUsernameID():rippleServer.getNamefield_id();
                details[2] = rippleServer.getPassfield_id()==null || rippleServer.getPassfield_id().trim().length()<1 ?Configuration.getRipplePasswordID():rippleServer.getPassfield_id();
                details[3] = rippleServer.getRipple_username()==null?"":rippleServer.getRipple_username();
                details[4] = rippleServer.getRipple_password()==null?"":rippleServer.getRipple_password();
                break;
            }
        }

        return details;
    }
}
