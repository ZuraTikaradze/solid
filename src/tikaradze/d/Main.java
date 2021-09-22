package tikaradze.d;

// Dependency Inversion Principle
/** Depend upon abstractions, not concretions*/
/**
 * 1. High Level modules should not depend on low level modules; both should depend on abstractions
 * (Hight level მოდულები ანუ რომლებიც რეალურ პრობლემებს წყვეტენ . უმეტესად ბიზნეს ლოგიკას უწოდებენ, ისინი პასუხობენ
 * კითხვას რა გააკეთოს პროგრამულმა უზრუნველყოფამ . low level მოდულები აპასუხობენ კითხვას როგორ გააკეთოს პროგრამულმა უზრუნველყოფამ.
 *  low level -მოდულები : logging, data access , network communication, io
 *  high level -მოდულები : payment, user management , payment ი იყენებს networkings, user management -ი (data access, security ... ) ა.შ.
 * 2. Abstractions should not depend on details Details should depend upon abstraction
 * */

public class Main {
    public static void main(String[] args) {

    }
}
