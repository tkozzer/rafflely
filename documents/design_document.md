# Raffely

## Background
The Schofield Lions Club (Wisconsin) is a very active club and puts on numerous events
each year. Most events entail some kind of raffle. A raffle can vary depending on what class they are regulated under. In Wisconsin, there are two types of raffles,
[Class A license](/documents/assets/ClassALicense.pdf) and [Class B license](/documents/assets/ClassBLicense.pdf). Rafflely is interested in providing digital solutions for both
types of raffles, but the initial focus will be Class B types of raffles which are
also knowns as multiple-container raffles or single-container raffles.

With multiple-container raffles, there will be a set of prizes with a wide variety of
different items that people can win. A person can only purchase tickets on the day
of the raffle. After a person purchases the tickets, they will then be able to go
and put their tickets in whatever containers they would like. What Rafflely is trying
to do is streamline the process of raffle sign-up, participation, and notification.
When a person comes to buy a set of raffle tickets, the current process is writing down
that person's full name and their phone number. Once the raffle has been drawn, the
raffle winner's tickets are posted on the container that they won. If the winner is
not there, they are manually sent a text by the raffle organizer.

Rafflely can take the tedious process of having to do everything manually and automate
the process along with providing additional features to both the organizers and
participants. By inputing data digitally, we can access the power of automating
processes that can take a lot of time and are also prone to error. With Rafflely,
event organizers will be able to also capture their participant base to help inform
them on upcoming raffles. After a raffle has been drawn, text messages can be sent
automatically to the winners informing them what they won with instructions to claim
their prize. It will also give event organizer's the ability to award recurring
participants and encourage other participants to come back in the future.

## Glossary

**Organizer** - the organization who runs the raffle. They must be able to hold the
required license.  
**Participant** - a person who purchases raffle tickets.  
**Raffle** - is a type of event where participants will purchase a ticket or tickets and
try to win prizes.

## Business Requirements

### Organizer

* As an organizer, I want to capture participants information, so that I can inform
them if they won a raffle.
* As an organizer, I want to have a text message automatically sent to a participant
if they won a raffle.
* As an organizer, I want send out text messages to participants informing them of when
we will be holding our raffles.
* As an organizer, I want to be able to display my prizes online, so that I can
encourage people to come to my raffle.
* As an organizer, I want to know the frequency of someone's participation, so that I
can provide enter the in exclusive raffles as a reward.
* As an organizer, I want to create a raffle event which will include all relevant information
(i.e. location, time, prizes, etc) of the raffle, so that I can share this with potential
participants.
* As an organizer, I want to be able to see how much money is raised from a given raffle.
* As an organizer, I want to be able to download a in depth report of how much money was
raised during a given raffle.
* As an organizer, I want to allow participants to pre-register for a raffle event, so that
I can get a good idea of how many people are going to show up.
* As an organizer, I want to have a hard copy of the participants just in case the I can't
access the data.

### Participant

* As a participant, I want to be notified if I have won a prize, so I can claim it.
* As a participant, I want to be able to be notified of the upcoming raffle events.  
* As a participant, I want to be able to see what each container prize is and see an
estimated value of each container.  
* As a participant, I want to see a history of my participation in previous events, so
I can make sure to make the threshold for the exclusive raffles.  
* As a participant, I want to be able to change/update my information, so I can make
sure it is the most current.  
* As a participant, I want to be able to delete my information.  
* As a participant, I want to be able to opt out of text messages.
* As a participant, I want to be able to use a credit/debit card to participate in the raffle.  

## Architecture  

![Image](/documents/assets/rafflely_architecture.png)  

*Figure 1: Diagram showing the architecture of the Rafflely services. A user (organizer or
participant) connects to the Rafflely Client (website). The Client will make API calls to
various Lambdas to perform a given task. Tasks could range from creating/updating/deleting events to managing participant sign-ups.  The lambda will do the necessary task along with persisting data to DynamoDB. Once data is persisted and processing is complete, the data will be sent back to the Client.*  

## Rafflely Services Implementation

## API  
---
### Public Models

```
// Organization
String organizationId;
String adminOrganizerId;
String nameOfOrg;
OrganzationType typeOfOrg;
String email;
String phoneNumber;
String address;
String classALicenseNumber;
String classBLicenseNumber;
String hashedPassword;
String salt;
String dateAccountCreated;
String classADateObtained;
String classBDateObtained;
Boolean isEmailVerified;
Boolean isPhoneVerified;
Boolean isEmailSubscribed;
Boolean isPhoneSubscribed;
List<String> eventIds;
List<String> organizerIds;
String organizationPicURL;
Boolean isActive;
```

```
// User
String userId;
List<String> organizationIds;
String firstName;
String lastName;
String birthDate;
String email;
String phoneNumber;
String hashedPassword;
String salt;
String dateAccountCreated;
Boolean isEmailVerified;
Boolean isPhoneVerified;
Boolean isEmailSubscribed;
Boolean isPhoneSubscribed;
String profilePicURL;
Boolean isActive;

// Organizer extends User
Boolean isAdmin;

// Participants extends User
List<RaffleTicket> raffleParticipation; 
```

```
// Raffle
String raffleId;
String eventId;
List<String> raffleItemIds;
String dateOfRaffle;
RaffleClass raffleClass;
RaffleType raffleType;
String timeOfDrawing;
String description;
```

```
// RaffleTicket
String raffleTicketNumber;
String userId;
String raffleId;
```

```
// Event
String eventId;
String organizationId;
List<String> raffleIds;
String nameOfEvent;
Address eventAddress;
String description;
String dateOfEvent;
String startOfEvent;
String endOfEvent;
```
```
// Address
String line1;
String line2;
String aptNumber;
String city;
String state;
String zipcode;
```

```
// RaffleItem
String raffleItemId;
String raffleId;
String nameOfItem;
String description;
List<String> listOfContents;
Double estimatedValue;
String winnerUserId;
String imageURL;
```
