package step3

object Runner extends App {

  def results(items: Item*): Result = {
    var r: Result = ResultO
    items.foreach(i => r = ResultP(r, i))
    r
  }

  val itemX  = Item("ItemX")
  val item01 = Item("Item01")
  val item02 = Item("Item02")
  val item03 = Item("Item03")
  val item04 = Item("Item04")
  val item05 = Item("Item05")
  val item06 = Item("Item06")
  val item07 = Item("Item07")
  val item08 = Item("Item08")
  val item09 = Item("Item09")
  val item10 = Item("Item10")
  val item11 = Item("Item11")
  val item12 = Item("Item12")
  val item13 = Item("Item13")
  val item14 = Item("Item14")
  val item15 = Item("Item15")
  val item16 = Item("Item16")

  val number1 = 左数有(左数有(左数有(左数有(左数零, item01), item02), item03), item04)
  val number2 = 正法(正法(正法(中法.零, item05), item06), item07)

  assert(number1.methodR(number2) == results(item01, item02, item03, item04, item05, item06, item07))

  val number3            = 左数有(左数有(左数有(左数有(左数零, item01), item02), item03), item04)
  lazy val number4: NumR = 正法(正法(正法(number5, item05), item06), item07)
  lazy val number5       = 逆法(number4)

  val result1 = Vector(item05, item06, item07)
  assert(number3.methodR(number4) == results(result1 ++: result1 ++: result1 ++: result1: _*))

  val number6 = 左数有(左数有(左数有(左数有(左数零, item01), item02), item03), item04)
  val number7 = 逆法(逆法(逆法(中法.零)))
  assert(number6.methodR(number7) == ResultP(ResultO, item01))

  val number8 = 左数有(左数有(左数有(左数有(左数零, item01), item02), item03), item04)
  val number9 = 逆法(逆法(逆法(逆法(中法.零))))
  assert(number8.methodR(number9) == ResultO)

  val number10 = 左数有(左数有(左数有(左数有(左数零, item01), item02), item03), item04)
  val number11 = 逆法(逆法(逆法(逆法(逆法(中法.零)))))
  assert(number10.methodR(number11) == ResultO)

  val number12 =
    左数有(
      左数有(
        左数有(
          左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数零, item01), item02), item03), item04), item05), item06), item07), item08), item09), item10), item11),
          item12
        ),
        item13
      ),
      item14
    )
  lazy val number13: NumR = 逆法(逆法(逆法(number14)))
  lazy val number14       = 正法(number13, itemX)
  assert(number12.methodR(number14) == results(itemX, itemX, itemX, itemX, itemX))

  val number15 =
    左数有(
      左数有(
        左数有(
          左数有(
            左数有(
              左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数零, item01), item02), item03), item04), item05), item06), item07), item08), item09), item10),
              item11
            ),
            item12
          ),
          item13
        ),
        item14
      ),
      item15
    )
  lazy val number16: NumR = 逆法(逆法(逆法(number17)))
  lazy val number17       = 正法(number16, itemX)
  assert(number15.methodR(number17) == results(itemX, itemX, itemX, itemX, itemX))

  val number18 =
    左数有(
      左数有(
        左数有(
          左数有(
            左数有(
              左数有(
                左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数有(左数零, item01), item02), item03), item04), item05), item06), item07), item08), item09), item10),
                item11
              ),
              item12
            ),
            item13
          ),
          item14
        ),
        item15
      ),
      item16
    )
  lazy val number19: NumR = 逆法(逆法(逆法(number20)))
  lazy val number20       = 正法(number19, itemX)
  assert(number18.methodR(number20) == results(itemX, itemX, itemX, itemX, itemX, itemX))

  /*trait Number21 extends NumR {
    def tail: Number21
    def next: Number21
  }

  trait Number21P extends Number21 with 正法 {
    override def tail: Number21
    override def head: Item
    override def next: Number21
  }
  object Number21P {
    def apply(tail: => Number21, head: Item): Number21P = {
      def tail1 = tail
      val head1 = head
      new Number21P {
        override def tail: Number21 = tail1
        override def head: Item     = head1
      }
    }
  }

  def number22(tail: => Number21): Number21 = Number21P(Number21P(Number21P(tail, item01), item02), item03)*/

}
