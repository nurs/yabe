/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import play.*;
import play.mvc.*;

/**
 *
 * @author nursultan
 */
@Check("admin")
@With(Secure.class)
public class Posts extends CRUD {
    
}
