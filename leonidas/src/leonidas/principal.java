using System;

namespace ENIGMA{

    class Program {

        static void Main(string[] args) {

            P d = new P();

            d.PP();

            E s = new E();

            s.A();

            s.PP();

            Console.ReadKey();

        }

        class P {

            public void PP()

            {

                Console.WriteLine("PP");

            }

        }

        class E : P {

            public void A()

            {

                Console.WriteLine("A");

            }

        }

    }