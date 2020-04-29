/*
 * NÃO É PERMITIDO MODIFICAR NADA NESTE ARQUIVO,
 * EXCETO PELO CONSTRUTOR E OS MÉTODOS INDICADOS.
 */

package br.pro.hashi.ensino.desagil.projeto1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Translator {
    private final Node root;
    private final HashMap<Character, Node> map;


    // Você deve mudar o recheio do construtor,
    // de acordo com os requisitos do projeto.
    public Translator() {
        map = new HashMap<Character, Node>();
        root = new Node(' ');

        // ========== RIGHT EXTERNAL ==============

        Node t = new Node('t');
        root.setRight(t);
        t.setParent(root);

        Node m = new Node('m');
        t.setRight(m);
        m.setParent(t);

        Node o = new Node('o');
        m.setRight(o);
        o.setParent(m);

        Node vazio = new Node(' ');
        o.setRight(vazio);
        vazio.setParent(o);

        Node zero = new Node('0');
        vazio.setRight(zero);
        zero.setParent(vazio);

        Node nove = new Node('9');
        vazio.setLeft(nove);
        nove.setParent(vazio);

        Node vazio2 = new Node(' ');
        o.setLeft(vazio2);
        vazio.setParent(o);

        Node oito = new Node('8');
        vazio2.setLeft(oito);
        oito.setParent(vazio2);

        Node g = new Node('g');
        m.setLeft(g);
        g.setParent(m);

        Node z = new Node('z');
        g.setLeft(z);
        z.setParent(g);

        Node sete = new Node('7');
        z.setLeft(sete);
        sete.setParent(z);

        Node q = new Node('q');
        g.setRight(q);
        q.setParent(g);

        // ========= RIGHT INTERNAL =============

        Node n = new Node('n');
        t.setLeft(n);
        n.setParent(t);

        Node d = new Node('d');
        n.setLeft(d);
        d.setParent(n);

        Node b = new Node('b');
        d.setLeft(b);
        b.setParent(d);

        Node seis = new Node('6');
        b.setLeft(seis);
        seis.setParent(b);

        Node igual = new Node('=');
        b.setRight(igual);
        igual.setParent(b);

        Node x = new Node('x');
        d.setRight(x);
        x.setParent(d);

        Node barra = new Node('/');
        x.setLeft(barra);
        barra.setParent(x);

        Node k = new Node('k');
        n.setLeft(k);
        k.setParent(n);

        Node y = new Node('y');
        k.setRight(y);
        y.setParent(k);

        Node c = new Node('c');
        k.setLeft(c);
        c.setParent(k);

    //========= LEFT INTERNAL =============

        Node e = new Node('e');
        root.setLeft(e);
        e.setParent(root);

        Node a = new Node('a');
        e.setRight(a);
        a.setParent(e);

        Node w = new Node('w');
        a.setRight(w);
        w.setParent(a);

        Node j = new Node('j');
        w.setRight(j);
        j.setParent(w);

        Node um = new Node('1');
        j.setRight(um);
        um.setParent(j);

        Node p = new Node('p');
        w.setLeft(p);
        p.setParent(w);

        Node r = new Node('r');
        a.setLeft(r);
        r.setParent(a);

        Node l = new Node('l');
        r.setLeft(l);
        l.setParent(r);

        Node vazio3 = new Node(' ');
        r.setRight(vazio3);
        vazio3.setParent(r);

        Node mais = new Node('+');
        vazio3.setLeft(mais);
        mais.setParent(vazio3);

        //========= LEFT EXTERNAL ===========

        Node i = new Node('i');
        e.setLeft(i);
        i.setParent(e);

        Node s = new Node('s');
        i.setLeft(s);
        s.setParent(i);

        Node h = new Node('h');
        s.setLeft(h);
        h.setParent(s);

        Node cinco = new Node('5');
        h.setLeft(cinco);
        cinco.setParent(h);

        Node quatro = new Node('4');
        h.setRight(quatro);
        quatro.setParent(h);

        Node v = new Node('v');
        s.setRight(v);
        v.setParent(s);

        Node tres = new Node('3');
        v.setRight(tres);
        tres.setParent(v);


        Node u = new Node('u');
        i.setLeft(u);
        u.setParent(i);

        Node vazio4 = new Node(' ');
        u.setRight(vazio4);
        vazio.setParent(u);

        Node dois = new Node('2');
        vazio4.setLeft(dois);
        dois.setParent(vazio4);

        Node f = new Node('f');
        u.setLeft(f);
        f.setParent(u);


     // ========= setting maps ===========


        map.put('a', a);
        map.put('b', b);
        map.put('c', c);
        map.put('d', d);
        map.put('e', e);
        map.put('f', f);
        map.put('g', g);
        map.put('h', h);
        map.put('i', i);
        map.put('j', j);
        map.put('k', k);
        map.put('l', l);
        map.put('m', m);
        map.put('n', n);
        map.put('o', o);
        map.put('p', p);
        map.put('q', q);
        map.put('r', r);
        map.put('s', s);
        map.put('t', t);
        map.put('u', u);
        map.put('v', v);
        map.put('w', w);
        map.put('x', x);
        map.put('y', y);
        map.put('z', z);
        map.put('1', um);
        map.put('2', dois);
        map.put('3', tres);
        map.put('4', quatro);
        map.put('5', cinco);
        map.put('6', seis);
        map.put('7', sete);
        map.put('8', oito);
        map.put('9', nove);
        map.put('0', zero);
        map.put('=', igual);
        map.put('+', mais);
    }



    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    public char morseToChar(String code) {
        Node origem = root;

        for (int i = 0; i < code.length(); i++) {

            char no = code.charAt(i);

            if (no == '-') {
                origem = origem.getRight();
            } else if (no == '.') {
                origem = origem.getLeft();
            }

        }

        if (origem != null) {
            return origem.getValue();
        } else {
            return ' ';
        }
    }





    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    private String charToMorse(Node node) {
        return " ";
    }




    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    public LinkedList<String> getCodes() {
        return new LinkedList<>();
    }

}
