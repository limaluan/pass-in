-- Isso garante que todos os valores na coluna 'slug' sejam exclusivos
CREATE UNIQUE INDEX events_slug_key ON events(slug);

-- Isso garante que a combinação desses valores não se repitam
-- Ou seja, ele vai garantir que não exista nenhum participante (email) em dois eventos (event_id) e vice-versa
CREATE UNIQUE INDEX attendees_event_id_email_key ON attendees(event_id, email);

-- E isso garante que o usuário (attendee_id) não faça mais de um Check in
CREATE UNIQUE INDEX check_ins_attendee_id_key ON check_ins(attendee_id); 