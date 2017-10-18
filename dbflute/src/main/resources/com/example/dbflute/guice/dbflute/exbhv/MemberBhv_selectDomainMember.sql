/*
 [df:title]
 The example for select using domain entity
 
 [df:description]
 You can use a domain entity as result type
 if a selected column is one of a domain table. 
*/
-- #df:entity#
-- +domain+

-- !df:pmb!

select member.MEMBER_ID
     , member.MEMBER_NAME
     , member.BIRTHDATE
  from MEMBER member
