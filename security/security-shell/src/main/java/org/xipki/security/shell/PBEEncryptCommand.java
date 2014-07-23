/*
 * Copyright (c) 2014 Lijun Liao
 *
 * TO-BE-DEFINE
 *
 */

package org.xipki.security.shell;

import org.apache.felix.gogo.commands.Command;
import org.xipki.security.PBEPasswordResolver;

/**
 * @author Lijun Liao
 */

@Command(scope = "keytool", name = "pbe-enc", description="Encrypt password with master password")
public class PBEEncryptCommand extends SecurityCommand
{
    @Override
    protected Object doExecute()
    throws Exception
    {
        char[] masterPassword = readPassword("Please enter the master password");
        char[] password = readPassword("Please enter the password");

        String passwordHint = PBEPasswordResolver.encryptPassword(masterPassword, password);
        System.out.println("The encrypted password is: '" + passwordHint + "'");
        return null;
    }

}
