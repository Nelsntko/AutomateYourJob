#NoEnv  ; Recommended for performance and compatibility with future AutoHotkey releases.

#include DateParse.ahk

#include TF.ahk

#include ClientSpecifics.ahk

; This script includes TF which can be found here: https://github.com/hi5/TF
; DateParse was found here: https://autohotkey.com/board/topic/18760-date-parser-convert-any-date-format-to-yyyymmddhh24miss/page-6

F8::Pause

:*:;osp::

SetKeyDelay, -1

send outside of the screening period.

 

return

 

:*:;nuk::

SetKeyDelay, -1

send no UK addresses.

 

return

 

:*:;ap::

SetKeyDelay, -1

send awaiting permission to contact.

 

return

 

:*:;ad::

SetKeyDelay, -1

 

reply = Do you have any supporting documentation for this employment?`n`nThis can be payslips, tax documentation, P45, or an employment contract.`n`nPreferably the document(s) will show your start and end month, but we will be happy to receive whatever you may have retained.

send %reply%

 

return

 

:*:;de::

SetKeyDelay, -1

send during education.

 

return

 

:*:;acc::

SetKeyDelay, -1

send awaiting Candidate contact.

 

return

 

:*:;crc::

SetKeyDelay, -1

send awaiting Criminal Record Check.

 

return

 

:*:;nr::

SetKeyDelay, -1

send not required.

 

return

 

:*:;jsa::

SetKeyDelay, -1

send Could you provide us with any evidence of claim from the Jobcentre? If you do not have any you may contact the Jobcentre at 0345 608 8545 and request it to be mailed to your house. It should take under 5 days to arrive.

 

return

 

:*:candidate::

SetKeyDelay, -1

send Candidate

return

 

:*:canddiate::

SetKeyDelay, -1

send Candidate

return

 

:*:F&P::

SetKeyDelay, -1

send Fitness & Propriety

return

 

:*:2:2::

SetKeyDelay, -1

send (Second Class, Lower Division)

return

 

:*:2:1::

SetKeyDelay, -1

send (Second Class, Upper Division)

return

 

:*:1:1::

SetKeyDelay, -1

send (First Class)

return

 

:*:3:3::

SetKeyDelay, -1

send (Third Class)

return

 

!j::

SetKeyDelay, -1

Click 250, 823

send ^a

send The Candidate provided a copy of a letter that they received from the Jobcentre to verify that they were claiming benefits.`n`nA reference was sent out to the Jobcentre, if a response is received it will be added to the report. 

 

return

 

!3::

SetKeyDelay, -1

Click 394, 615

ClipBoard =

send ^a^c

ClipWait, .25

client = %clipboard%

Click 226, 790

send ^a{DELETE}

send To be confirmed in house.

click 229, 765

click 1556, 963

click 30, 41

send {HOME}

send %client%: to be confirmed in house.`n`n

sleep 350

click 500, 298

return

 

!4::

SetKeyDelay, 250

 

clipboard =

click 518, 390

sleep 50

send ^a^c

ClipWait, .25

FileAppend, %clipboard%, clipdump.txt

TF_RemoveLines("!clipdump.txt", 1, 212)

TF_Replace("!clipdump.txt"," Click on any company registration number below to link to options for that company.  ","")

TF_Replace("!clipdump.txt"," Company Company Name App.Type App.Date Resign Date Dissolved Date ","")

 

previous := TF_Find("clipdump.txt", "", "", "Previous Appointments")

 

previous -= 2

current := TF_ReadLines("clipdump.txt",5,previous)

click 490, 761

send %current%

send ^{HOME}

 

previous -= 4

if previous > 3

                {

                previous = 3

                }

                send %previous%

i = 0

while(i < previous){

 

                clipboard =

                send {DELETE}

                send {HOME}^+{RIGHT}+{LEFT}^x

                ClipWait, .25

                number = %clipboard%

                clipboard =

                send {END}{BACKSPACE 3}^+{LEFT}^x

                ClipWait, .25

                date = %clipboard%

                clipboard =

                send ^+{LEFT}{backspace 2}+{home}^x

                ClipWait, .25

                company = %clipboard%

                send The Candidate was found as a current director of %company% (no. %number%) appointed on{SPACE}

                Date(date)

                send .{RETURN}{DOWN}

 

                i += 1    

               

}

if (i >= 3){

                send There were more directorships identified against the Candidate's name. Please refer to the attached report.

                }

               

FileDelete, clipdump.txt

return

 

!q::

SetKeyDelay, -1

 

Click 238, 732

clipboard =

send {HOME}+{END}^c

ClipWait, .25

name = %clipboard%

 

Click 226, 747

clipboard =

send {HOME}+{END}^c

ClipWait, .25

title = %clipboard%

 

click 396, 617

ClipBoard =

send ^a^c

ClipWait, .25

company = %clipboard%

 

click 395, 645

ClipBoard =

send ^a^c

ClipWait, .25

date = %clipboard%

 

click 391, 705

ClipBoard =

send ^a^c

ClipWait, .25

award = %clipboard%

 

click 288, 778

send ^a{DELETE}

If (name = null){

send %company%

}

If (title != name && title != null){                               ; If title was not entered the name is copied to title and name. The null check is if they leave a nl.

send %name% (%title%)

}

else {

send %name%

}

if (award == null){

award = [AWARD]

}

If (date == null){

send {SPACE}has advised that the Candidate was awarded a %award%.

}

else{

send {SPACE}has advised that the Candidate was awarded a %award% on{SPACE}

Date(date)

send .

}

return

 

!2::

SetKeyDelay, -1

 

Click 381, 129

Click 531, 282

send {HOME}

Click D 487, 192

Click U 870, 190

clipboard =

send ^c

ClipWait, .25

fullName = %clipboard%

Click D 385, 354

Click U 492, 354

clipboard =

send ^c

ClipWait, .25

dateOfBirth = %clipboard%

 

Click D 724, 473

Click U 902, 473

clipboard =

send ^c

ClipWait, .25

previous = %clipboard%

 

click D 384, 330

Click U 432, 328

clipboard =

send ^c

ClipWait, .25

title = %clipboard%

click 267, 129

 

click 714, 500

send ^a{DELETE}

send %title%

click 715, 472

send %fullName%

click 715, 472

send {HOME}{CTRLDOWN}{SHIFTDOWN}{RIGHT}{CTRLUP}{SHIFTUP}

clipboard =

send ^c

ClipWait, .25

firstName = %clipboard%

send {END}{CTRLDOWN}{SHIFTDOWN}{LEFT}{CTRLUP}{SHIFTUP}

clipboard =

send ^c

ClipWait, .25

lastName = %clipboard%

send {CTRLDOWN}a{CTRLUP}{DELETE}

click 716, 534

send ^a{DELETE}

send %firstName%

click 713, 594

send ^a{DELETE}

send %lastName%

click 711, 622

 

newDate := DateParse(dateOfBirth)                                 ;- convert date to YYYYMMDDHH24MISS format

 

FormatTime, fNewDate, %newDate%, ddMMyyyy                      ;- fbegindt is formatted begin date

 

send ^a{DELETE}

send %fNewDate%

 

Click 715, 685

send ^a{DELETE}

send %previous%

 

return

 

!c::

sleep 125

SetKeyDelay, -1

 

Click 306, 83 ; set to E-Mail

sleep 750 ; it takes ~450 to load.

 

Click 386, 411 ; this block deletes the Candidate's middle name.

send {HOME}^{RIGHT 2}+{END}{DELETE}`n

 

 

Click 689, 161 ; fix candidate capitalisation

send {HOME}^{RIGHT 4}+^{RIGHT 2}{DELETE}the Candidate requesting{SPACE}

 

 

sleep 125

click 153, 224

ClipBoard =

send {HOME}{SHIFTDOWN}{END}{CTRLDOWN}{LEFT}{CTRLUP}{LEFT}^c{SHIFTUP}

ClipWait, .25

client = %clipboard% ; get client name for text & client check.

Click 151, 44 ; edit

sleep 145

click 373, 449

 

send {BACKSPACE}We are the employment representatives of %client% and are currently gathering your references on their behalf. Could you please provide additional information as follows at your earliest convenience?`n`n`n`nThank you for your attention to this email.`n`n

 

Click 370, 575

 

send {DELETE}{DELETE}{DELETE} ; extra spaces appear. Not sure why yet.

 

ClientCheck(client) ; this will add what I generally ask for depending on the client.

 

return

 

 

!g::

SetKeyDelay, -1

 

ClipBoard =

send ^a^c

ClipWait, .25

FileAppend, %Clipboard%, clipdump.txt

RunWait, "C:\\Program Files\Microsoft Office 15\root\office15\Outlook.exe" /c ipm.note /m vero@gcs-group.com ; for some reason %programfiles% doesn't work.

TF_TrimLeft("!clipdump.txt","1","1",1)

name := TF_ReadLines("clipdump.txt",1,1)

TF_TrimLeft("!clipdump.txt","9","9",13)

TF_Replace("!clipdump.txt"," Gender ","`n")

birthDate := TF_ReadLines("clipdump.txt",9,9)

 

TF_TrimLeft("!clipdump.txt","19","19",43)

TF_Replace("!clipdump.txt"," Gender ","`n")

TF_Replace("!clipdump.txt","Passport Number ", "`n") ; leave the nationality on a blank line to copy it

nationality := TF_ReadLines("clipdump.txt",19,19)

TF_RemoveLines("!clipdump.txt", 20, 20) ; delete the new line so the rest of the text isn't misplaced

TF_Replace("!clipdump.txt","(NI/SSN) ", "`n")

NIN := TF_ReadLines("clipdump.txt",22,22)

TF_RemoveLines("!clipdump.txt", 22, 22)

lineEnd := TF_Find("clipdump.txt", "", "", "Employment History")

TF_RemoveLines("!clipdump.txt", lineEnd, 999)

addressStart := TF_Find("clipdump.txt", "", "", "Address History")

TF_RemoveLines("!clipdump.txt", 1, addressStart)

TF_Replace("!clipdump.txt","-","")

 

TF_Replace("!clipdump.txt","Address Type Previous Address House Name ","")

TF_Replace("!clipdump.txt","Post Code / ZIP ","")

TF_Replace("!clipdump.txt"," Country ","")

TF_Replace("!clipdump.txt","Town ","")

TF_Replace("!clipdump.txt"," County / State","")

TF_Replace("!clipdump.txt","Address Line 1 ","")

TF_Replace("!clipdump.txt"," Address Line 2 ","")

TF_Replace("!clipdump.txt","Flat  House Number  ","")

TF_Replace("!clipdump.txt"," House Number ",", ")

TF_Replace("!clipdump.txt","`r`r","")

TF_Replace("!clipdump.txt","`r`r","")

 

TF_RemoveLines("!clipdump.txt", 1, 1)

 

while (true){

x = 4

y = 7

i = 0

while i<15{

 

TF_RemoveLines("!clipdump.txt", x, y)

x += 4

y += 4

i++

}

break

}

addresses := TF_ReadLines("clipdump.txt", 1)

 

 

sleep 450

sleep 95

Click 159, 291

send Credit check{ENTER}

Send Hi,`n`nThe candidate’s Details:`n`nType: Standard`n`nCountry: COUNTRY`n`nName: %name%`nDate of Birth: %birthDate%`nNational Identification Number: %NIN%`nAddress/es: `n`n%addresses%The candidate’s Declaration is attached.`n`nKind Regards,

 

FileDelete, clipdump.txt

 

return

 

!e::

SetKeyDelay, -1

 

Click 386, 612

ClipBoard =

send ^a^c

ClipWait, .25

client = %clipboard%

 

Click 315, 787

clipboard =

send {HOME}{SHIFTDOWN}{END}{SHIFTUP}^c

ClipWait, .25

name = %clipboard%

 

Click 243, 802

clipboard =

send {HOME}{SHIFTDOWN}{END}{SHIFTUP}^c

ClipWait, .25

title = %clipboard%

 

Click 449, 642

clipboard =

send ^a^c

ClipWait, .25

start = %clipboard%

Click 468, 673

clipboard =

send ^a^c

ClipWait, .25

end = %clipboard%

Click 422, 701

Clipboard =

send ^a^c

ClipWait, .25

position = %clipboard%

Click 410, 731

Clipboard =

send ^a^c

ClipWait, .25

salary = %clipboard%

Click 381, 800

 

send ^a{DELETE}

If (name = null) {

send %client%

}

 

else If (title != name && title != null){                     ; If title was not entered the name is copied to title and name. The null check is if they leave a nl.

send %name% (%title%)

}

else {

send %name%

}

 

send {SPACE}has advised that the Candidate was employed from{SPACE}

Date(start)

 

send {SPACE}to{SPACE}

Date(end)

 

 

If (position != null)

{

send {SPACE}in the position of %position%

}

If (salary != null)

{

send {SPACE}with a salary of %salary%

}

send .`n`nNo further information was provided.

 

If (start = null || end = null || position = null)

{

Click 238, 763

}

return

 

!+e::

SetKeyDelay, -1

 

send The referee described the Candidate as`n`nThey further advised that the Candidate was honest and showed integrity, and the Candidate's health and disciplinary record were clean.`n`nThe reason for leaving stated was XXX and the Company would re-employ the Candidate.

return

 

!o::

SetKeyDelay, -1

click 226, 788

ClipBoard =

send ^a^x

ClipWait, .25

text = %clipboard%

FileAppend, %Clipboard%, clipdump.txt

clipboard =

TF_RangeReplace("!clipdump.txt", ", provided", ".", "", False, 0, 0)

TF_Replace("!clipdump.txt","Online reference confirmed by ","")

TF_Replace("!clipdump.txt","Would the referee re-employ the candidate Yes","The Company would re-employ the Candidate.")

TF_Replace("!clipdump.txt","Would the referee re-employ the candidate No","The Company would not re-employ the Candidate.`n`n")

title := TF_ReadLines("clipdump.txt", 1,1)

TF_RemoveLines("!clipdump.txt", 1, 1)

 

send %title%!e

lines := TF_ReadLines("clipdump.txt")

 

FileDelete, clipdump.txt

 

click 383, 98

click D 459, 159

click U 886, 158

ClipBoard =

send ^c

ClipWait, .25

click 288, 96

 

 

FileAppend, %ClipBoard%, clipdump.txt

TF_Replace("!clipdump.txt"," ","`n")

first := TF_ReadLines("clipdump.txt", 1,1)

FileDelete, clipdump.txt

click 228, 849 ; textbox

 

FileAppend, %lines%, clipdump.txt

 

TF_Replace("!clipdump.txt",first,"The Candidate")

TF_Replace("!clipdump.txt","`r`n"," ")

TF_Replace("!clipdump.txt","  The Company would re-employ the Candidate.","`n`nThe Company would re-employ the Candidate.{DELETE}")

 

linesTwo := TF_ReadLines("clipdump.txt", 0)

 

send {HOME}%linesTwo%

send {ENTER}N

FileDelete, clipdump.txt

 

return

 

 

!d::

SetKeyDelay, -1

send Despite numerous attempts it has not been possible to confirm this period at source.`n`nThe Candidate was in full time education during this period.`n`nThe Candidate has provided [SUPPORTING DOCUMENTATION].

return

 

!a::

sleep 35

SetKeyDelay, -1

click 385, 667

 

ClipBoard =

send ^a^c

ClipWait, .25

start = %clipboard%

 

click 389, 696

ClipBoard =

send ^a^c

ClipWait, .25

end = %clipboard%

 

FormatTime, today, %fdate%, MM/yyyy

if (end = null){

click 389, 696

send %today%

}

 

click 232, 812

ClipBoard =

send {HOME}{SHIFTDOWN}{END}{SHIFTUP}^c

ClipWait, .25

name = %clipboard%

 

click 230, 827

ClipBoard =

send {HOME}{SHIFTDOWN}{END}{SHIFTUP}^c

ClipWait, .25

title = %clipboard%

 

send ^a{DELETE}

 

if (title != name && title != null) {

send %name% (%title%){SPACE}

}

else {

send %name%{SPACE}

}

 

if (end = null || end = today) {

send advised that the Candidate has been self-employed since{SPACE}

Date(start)

send .

}

else {

send advised that the Candidate has been self-employed from{SPACE}

Date(start)

send {SPACE}to{SPACE}

Date(end)

}

 

send `n`nThey stated that the Company did not incur any County Court Judgements or file for bankruptcy and neither the company nor its director have any outstanding financial liabilities.`n`nThe accountant has personally known the Candidate for [YEARS] years.`n`nTo the best of the Accountant’s knowledge the Candidate has managed their financial affairs satisfactorily and they had no reason to question the Candidate's professional conduct.

 

click 503, 866

send {CTRLDOWN}{SHIFTDOWN}{RIGHT}{CTRLUP}{LEFT}{SHIFTUP}

return

 

!u::

sleep 35

SetKeyDelay, -1

 

Click 227, 762

clipboard =

send {HOME}+{END}^c

ClipWait, .25

name = %clipboard%

 

Click 228, 776

clipboard =

send {HOME}+{END}^c

ClipWait, .25

title = %clipboard%

 

Click 389, 613

clipboard =

send ^a^c

ClipWait, .25

university = %clipboard%

 

Click 439, 644

clipboard =

send ^a^c

ClipWait, .25

start = %clipboard%

sleep 20

 

Click 390, 669

clipboard =

send ^a^c

ClipWait, .25

end = %clipboard%

Click 299, 762

send ^a{DELETE}

 

If (title != name && title != null){                               ; If title was not entered the name is copied to title and name. The null check is if they leave a \n.

send %name% (%title%)

}

else

If (title != null)

{

send %name%

}

else

{

send %university%

}

if (start != null && end != null)

{

send {SPACE}has advised that the Candidate attended from{SPACE}

Date(start)

send {SPACE}to{SPACE}

Date(end)

send {SPACE}and was awarded a{SPACE}

}

if (start = null && end = null)

{

send {SPACE}has advised that the Candidate was awarded:{RETURN}

}

if (end != null && start = null)

{

send [qualification] on{SPACE}

Date(end)

send .

}

 

ClipBoard =

click 395, 702

send ^a^c

ClipWait, .25

awarded = %clipboard%

 

If (start = null || end = null || awarded = null)

{

Click 230, 733 ; cannot confirm

}

 

Click 1101, 766

 

return

 

!n::

sleep 35

SetKeyDelay, -1

send Due to the time elapsed records have not been retained. The Candidate has not retained documentation.

return

 

!i::

SetKeyDelay, -1

 

send At the Client's request, the Candidate provided supporting documentation.`n`nThe award certificate(s) confirmed the dates and award provided on the questionnaire.

 

return

 

!s::

sleep 335

SetKeyDelay, -1

Click 24, 100

clipboard =

send ^{HOME}+{END}^x

ClipWait, .25

firstLine = %ClipBoard%

 

sleep 35

clipboard =

send ^a^x

ClipWait, .25

FileAppend, %Clipboard%, clipdump.txt

clipboard =

TF_Replace("!clipdump.txt", "Gap Identified","Non employment")

TF_TrimLeft("!clipdump.txt","","", 15)

 

lines := TF_ReadLines("clipdump.txt", 0)

 

send %firstLine%

send %lines%

clipboard =

FileDelete, clipdump.txt

 

send {DELETE 2}

send ^{HOME}

send {DOWN 2}

 

i = 0

while (i < 10){

 

send I was not employed from{SPACE}

clipboard =

send ^+{RIGHT}+{LEFT}^x

ClipWait, .25

date = %clipboard%

Date(date)

send {delete 2}

clipboard =

send ^+{RIGHT}+{LEFT}^x

ClipWait, .25

date = %clipboard%

send {SPACE}to{SPACE}

Date(date)

clipboard =

send +{end}^c

ClipWait, .25

reasonGiven = %clipboard%

 

if (reasonGiven != ""){

send {SPACE}during this period I %reasonGiven%

}

else {

send {BACKSPACE}.

}

 

clipboard =

send {DOWN}{HOME}+{end}^c

ClipWait, .25

checker = %clipboardall%

clipboard =

if(checker = null){

break

}

else {

send {HOME}

}

 

i += 1

 

}

 

return

 

!+s::

SetKeyDelay, -1

Click 271, 316

ClipBoard =

 

send ^a^c

ClipWait, .25

Click 271, 316

FileAppend, %Clipboard%, clipdump.txt

TF_RemoveLines("!clipdump.txt", 48, 48)

TF_Replace("!clipdump.txt","`r`n"," ")

TF_Replace("!clipdump.txt","Thank you for choosing to complete your Statement of Fact online. By completing this statement online you will not be required to return any paperwork. An online response expedites your employment screening; it’s more secure, and carbon neutral. Please check the statement details in the box below (read only) and add any amendments in the lower box.", "")

TF_Replace("!clipdump.txt","Please add any comments relating to this statement below: (Max characters 1,140)", "")

TF_Replace("!clipdump.txt","I confirm the details contained in the above statement are correct to the best of my knowledge. I understand this statement is part of my background screening and as such any false statements or omissions could result in the delay of my employment commencing, or any offer of employment being withdrawn.","")

TF_Replace("!clipdump.txt","Checked time:", "`r`n") ; create a new line after Checked time to delete whatever date and IP is written there.

TF_RemoveLines("!clipdump.txt", -1)

TF_Replace("!clipdump.txt","I was","they were")

TF_Replace("!clipdump.txt"," my "," their ")

TF_Replace("!clipdump.txt","gfedcb","") ; This is what the pdf reader reads the tickbox as...

TF_Replace("!clipdump.txt"," I was "," they were ")

TF_Replace("!clipdump.txt"," I "," they ")

TF_Replace("!clipdump.txt",". t",". T") ; capitalising they in relevant places

TF_Replace("!clipdump.txt","  "," ")

TF_Replace("!clipdump.txt","  "," ")

TF_Replace("!clipdump.txt","  "," ")

TF_Replace("!clipdump.txt","  "," ")

TF_Replace("!clipdump.txt","  "," ")

lines := TF_ReadLines("clipdump.txt", 0)

 

 

Click 242, 873

 

send ^a{DELETE}

 

send The Candidate agreed with the online Statement of Fact confirming that%lines%{DELETE}

 

FileDelete clipdump.txt

 

return

 

!t::

SetKeyDelay, -1

Click 344, 83

sleep 220

Click 400, 417

send Hello from Vero Screening.`nA Statement of Fact has been generated to your email.`nOnce we receive your response, your screening should be complete.`n

Click 693, 159

send ^a{DELETE}

send SMS sent to the Candidate requesting that they complete the Statement of Fact.

return

 

!m::

sleep 35

SetKeyDelay, -1

Click 232, 572

send Despite numerous attempts it has not been possible to confirm this at source.

Return