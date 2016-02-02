#NoEnv  ; Recommended for performance and compatibility with future AutoHotkey releases.

; #Warn  ; Enable warnings to assist with detecting common errors.

SendMode Input  ; Recommended for new scripts due to its superior speed and reliability.

SetWorkingDir %A_ScriptDir%  ; Ensures a consistent starting directory.

 

ClientCheck(client){

                if (client == "Excelian") {

                                SetKeyDelay, 0

 

                                Click 689, 161 ; report notes

 

                                send ^a

                                send E-Mail sent to the Candidate requesting PoR, education certificate, and passport.

 

                                Click 374, 509 ; middle line of text

                                send Can you provide a scan or picture of the following documents:`n`n

 

                                Click 517, 77 ; bullet points

                                sleep 295

                                send Your passport, showing picture and full MRZ code along the bottom`nYour award certificate from your University`nA Proof of Residence document. This can be any bill dated in the last 3 months, or council tax letter in the previous 6 months. The document must show your name and current address.

                                }

 

                else if (client == "IFDS") {

 

                                Click 374, 509 ; middle line of text

 

                                send IFDS require supporting documentation for any period of unemployment greater than a month.`n`nCan you provide any supporting documentation for these period(s)? Documentation can be:`n`nTravel - passport stamps, ticket stubs, confirmation emails`nJobseeking - confirmation emails, evidence of Jobseekers allowance claim etc.`nOther - any documentation you have available that can confirm your activity during this period.`n`nIf you don't have any documentation it would be great if you could roughly outline your activity during this period so I can pass it on to IFDS.`n`nPlease note that IFDS always require evidence of Jobseekers allowance, and if you no longer have any available you can request it from the jobcentre by calling 0345 608 8545.

                                }

 

 

                else if (client == "M&G Ltd") {

 

                                Click 374, 503 ; middle line of text

 

                                send M&G require supporting documentation for any period of unemployment greater than a month.`n`nCan you provide any supporting documentation for these period(s)? Documentation can be:`n`nTravel - passport stamps, ticket stubs, confirmation emails`nJobseeking - confirmation emails, evidence of Jobseekers allowance claim etc.`nOther - any documentation you have available that can confirm your activity during this period.`n`nIf you don't have any documentation it would be great if you could roughly outline your activity during this period so I can pass it on to M&G.

                                }

               

                Click 99, 43 ; return to the Contact page from edit.

}