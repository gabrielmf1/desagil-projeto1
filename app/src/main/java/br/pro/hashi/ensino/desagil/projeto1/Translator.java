/*
 * NÃO É PERMITIDO MODIFICAR NADA NESTE ARQUIVO,
 * EXCETO PELO CONSTRUTOR E OS MÉTODOS INDICADOS.
 */

package br.pro.hashi.ensino.desagil.projeto1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Translator {
    private Node root;
    private HashMap<Character, Node> map;

    // Você deve mudar o recheio do construtor,
    // de acordo com os requisitos do projeto.
    public Translator() {

        map = new HashMap<Character, Node>();
        root = new Node(' ');

        Node e = new Node('e');
        Node t = new Node('t');
        Node i = new Node('i');
        Node a = new Node('a');
        Node n = new Node('n');
        Node m = new Node('m');
        Node s = new Node('s');
        Node u = new Node('u');
        Node r = new Node('r');
        Node w = new Node('w');
        Node d = new Node('d');
        Node k = new Node('k');
        Node g = new Node('g');
        Node o = new Node('o');
        Node h = new Node('h');
        Node v = new Node('v');
        Node f = new Node('f');
        Node l = new Node('l');
        Node p = new Node('p');
        Node j = new Node('j');
        Node b = new Node('b');
        Node x = new Node('x');
        Node c = new Node('c');
        Node y = new Node('y');
        Node z = new Node('z');
        Node q = new Node('q');
        Node cinco = new Node('5');
        Node quatro = new Node('4');
        Node tres = new Node('3');
        Node dois = new Node('2');
        Node mais = new Node('+');
        Node um = new Node('1');
        Node seis = new Node('6');
        Node igual = new Node('=');
        Node barra = new Node('/');
        Node sete = new Node('7');
        Node oito = new Node('8');
        Node nove = new Node('9');
        Node zero = new Node('0');
        Node vazio1 = new Node(' ');
        Node vazio2 = new Node(' ');
        Node vazio3 = new Node(' ');
        Node vazio4 = new Node(' ');

        root.setLeft(e);
        root.setRight(t);

        a.setParent(e);
        a.setLeft(r);
        a.setRight(w);
        map.put('a', a);

        b.setParent(d);
        b.setLeft(seis);
        b.setRight(igual);
        map.put('b', b);

        c.setParent(k);
        map.put('c', c);

        d.setParent(n);
        d.setLeft(b);
        d.setRight(x);
        map.put('d', d);

        e.setParent(root);
        e.setLeft(i);
        e.setRight(a);
        map.put('e', e);

        f.setParent(u);
        map.put('f', f);

        g.setParent(m);
        g.setLeft(z);
        g.setRight(q);
        map.put('g', g);

        h.setParent(s);
        h.setLeft(cinco);
        h.setRight(quatro);
        map.put('h', h);

        i.setParent(e);
        i.setLeft(s);
        i.setRight(u);
        map.put('i', i);

        j.setParent(w);
        j.setRight(um);
        map.put('j', j);

        k.setParent(n);
        k.setLeft(c);
        k.setRight(y);
        map.put('k', k);

        l.setParent(r);
        map.put('l', l);

        m.setParent(t);
        m.setLeft(g);
        m.setRight(o);
        map.put('m', m);

        n.setParent(t);
        n.setLeft(d);
        n.setRight(k);
        map.put('n', n);


        o.setParent(m);
        o.setLeft(vazio3);
        o.setRight(vazio4);
        map.put('o', o);


        p.setParent(w);
        map.put('p', p);

        q.setParent(g);
        map.put('q', q);

        r.setParent(a);
        r.setLeft(l);
        r.setRight(vazio2);
        map.put('r', r);

        s.setParent(i);
        s.setLeft(h);
        s.setRight(v);
        map.put('s', s);

        t.setParent(root);
        t.setLeft(n);
        t.setRight(m);
        map.put('t', t);

        u.setParent(i);
        u.setLeft(f);
        u.setRight(vazio1);
        map.put('u', u);

        v.setParent(s);
        v.setRight(tres);
        map.put('v', v);

        w.setParent(a);
        w.setLeft(p);
        w.setRight(j);
        map.put('w', w);

        x.setParent(d);
        x.setLeft(barra);
        map.put('x', x);

        y.setParent(k);
        map.put('y', y);

        z.setParent(g);
        z.setLeft(sete);
        map.put('z', z);

        um.setParent(j);
        map.put('1', um);

        dois.setParent(vazio1);
        map.put('2', dois);

        tres.setParent(v);
        map.put('3', tres);

        quatro.setParent(h);
        map.put('4', quatro);

        cinco.setParent(h);
        map.put('5', cinco);

        seis.setParent(b);
        map.put('6', seis);

        sete.setParent(z);
        map.put('7', sete);

        oito.setParent(vazio3);
        map.put('8', oito);

        nove.setParent(vazio4);
        map.put('9', nove);

        zero.setParent(vazio4);
        map.put('0', zero);

        igual.setParent(b);
        map.put('=', igual);

        barra.setParent(x);
        map.put('/', barra);

        mais.setParent(vazio2);
        map.put('+', mais);

        vazio1.setParent(u);
        vazio1.setRight(dois);

        vazio2.setParent(r);
        vazio2.setLeft(mais);

        vazio3.setParent(o);
        vazio3.setLeft(oito);

        vazio4.setParent(o);
        vazio4.setLeft(nove);
        vazio4.setRight(zero);
    }


    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    public char morseToChar(String code) {
        Node origem = root;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '.'){
                origem = origem.getLeft();
            } else if(code.charAt(i) == '-'){
                origem = origem.getRight();
            } else{
                return ' ';
            }
        }
        return origem.getValue();
    }

    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    private String charToMorse(Node node) {
        Node value = node;
        Node parent = node;
        String morse = "";

        while (value != root) {
            parent = value.getParent();
            if (parent.getLeft() == value){
                morse = '.' + morse;
            }
            else {
                morse = '-' + morse;
            }
            value = parent;
        }
        return morse;
    }



    // Este método deve permanecer como está.
    public String charToMorse(char c) {
        return charToMorse(map.get(c));
    }

    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    public LinkedList<String> getCodes() {
        LinkedList<String> lista = new LinkedList<String>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.element();
            Node left = node.getLeft();
            Node right = node.getRight();

            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }
            queue.remove();

            char value = node.getValue();

            if (value != '=' && value!= '/' && value!= '+' && value!= ' '){
                lista.add(charToMorse(node));
            }
        }
        return lista;
    }
}
