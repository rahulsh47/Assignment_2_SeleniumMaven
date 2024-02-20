package util;

import Pages.PageObjectManager;


import Pages.PageObjectManager;
import util.Base;

public class TextContextSetup {
    public Base base;
    public PageObjectManager pom;

    public TextContextSetup(){
        base = new Base();
        pom = new PageObjectManager(base.InitializeDriver());
    }
    public PageObjectManager setup(){
        return pom;
    }
}
