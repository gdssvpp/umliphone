package com.umliphone;

import com.umliphone.classes.iPhone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone("iPhone 2007");
        meuiPhone.tocar();
        meuiPhone.ligar("123456789");
        meuiPhone.exibirPagina("https://www.apple.com");
    }
}