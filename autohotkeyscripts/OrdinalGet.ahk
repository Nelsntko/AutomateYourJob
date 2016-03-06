; this adds the st / nd / rd / th to dates in another script.

OrdinalGet() {

                SetKeyDelay, 0

                clipBoard =

                send {CTRLDOWN}{LEFT}{LEFT}{CTRLUP}{LEFT}

                send {SHIFTDOWN}{LEFT}{SHIFTUP}^c

                ClipWait, .25

                num = %clipboard%

                clipBoard =

                send {LEFT}{SHIFTDOWN}{RIGHT}{SHIFTUP}

                send ^c

                ClipWait, .25

                check = %clipboard%

                send {RIGHT}

 

                if (check == 1)

                                checkNum = false

                else if (check == " ")

                                checkNum = false

                else

                                checkNum = true

 

                if (check == 1)

                                send th

                else if (checkNum && num == 1)

                                send st

                else if (checkNum && num == 2)

                                send nd

                else if (checkNum && num == 3)

                                send rd

                else

                                send th

                send {CTRLDOWN}{RIGHT}{RIGHT}{CTRLUP}

                return

}